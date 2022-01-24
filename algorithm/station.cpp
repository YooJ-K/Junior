#include <iostream>
using namespace std;
#include <math.h>
#include <fstream>
#include <string>
#include <cstring>

class Station {
	int T[3][3];
	double result;
	void online(double t, double s[3]);
	double distance(double t);
	void minimum(double s, double f);
public:
	Station();
	void get_Min();
};

Station::Station() {
	
	result = 1000000;

	ifstream ifile;
	int count = 0;
	char line[100]; // �� �پ� �о �ӽ÷� ������ ����

	ifile.open("station.inp");  // ���� ����

	if (ifile.is_open())
	{
		while (ifile.getline(line, sizeof(line))) // �� �پ� �о� ó���� �����Ѵ�.
		{	
			char *ptr = strtok(line, " ");      // " " ���� ���ڸ� �������� ���ڿ��� �ڸ�, ������ ��ȯ

			while (ptr != NULL)               // �ڸ� ���ڿ��� ������ ���� ������ �ݺ�
			{
				T[count / 3][count % 3] = atoi(ptr);
				ptr = strtok(NULL, " ");      // ���� ���ڿ��� �߶� �����͸� ��ȯ
				count++;
			}
			
		}
	}

	ifile.close(); // ���� �ݱ�

}

void Station::online(double t, double s[3]) {
	//A, B ���� ���� ��ġ�� �� s�� ��ǥ �������ִ� �Լ�

	// s(t) = t*B+(1-t)*A

	for (int i = 0; i < 3; i++) {
		s[i] = t * T[1][i] + (1 - t)*T[0][i];

	}

}

double Station::distance(double t) {
	//|P-S(t)| ���� ���ִ� �Լ�

	double s[3];
	online(t, s);
	double k = 0;

	for (int i = 0; i < 3; i++) {
		k = k + (T[2][i] - s[i])*(T[2][i] - s[i]);

	}

	return sqrt(k);
}

void Station::minimum(double s, double f) {
	if (s >= f || f - s < 0.0001)
		return;

	double mid = (s + f) / 2;
	double dis[3];

	dis[0] = distance(s);
	dis[1] = distance(mid);
	dis[2] = distance(f);

	if (dis[0] < dis[2]) {
		if (dis[0] < result)
			result = dis[0];
		minimum(s, mid);
	}
	else if (dis[0] == dis[2]) {
		result = dis[1];
	}
	else {
		if (dis[2] < result)
			result = dis[2];
		minimum(mid, f);
	}


}

void Station::get_Min() {
	minimum(0, 1);

	ofstream ou;
	ou.open("station.out");

	ou << ceil(result);

	ou.close();
}

int main() {
	Station e;
	e.get_Min();
	//cout << e.get_Min() << endl;
}
