#ifndef hangul_5_h
#define hangul_5_h
#include "Arduino.h"
#include <Adafruit_NeoPixel.h>
#ifdef __AVR__
#include <avr/power.h>
#endif

#define numOfNeo 25

struct timer {
	uint8_t hours = 0;
	uint8_t minutes = 0;
	uint8_t secs = 0;
};


class Hangul {
public:
	Adafruit_NeoPixel pixels = Adafruit_NeoPixel(36, 5, NEO_GRB + NEO_KHZ800);
	uint8_t _red = 0;
	uint8_t _green = 0;
	uint8_t _blue = 100;
	uint8_t old_r, old_g, old_b = 0;
	uint32_t color = pixels.Color(_red, _green, _blue);
	Hangul(uint8_t pin, uint8_t numpixels);
	void hourChange(uint8_t hours, uint8_t minutes);
	void minuteChange(uint8_t minutes);
	void resetLED();
	void setTimee(String input);
	void updateTime();
	void colorChange(uint8_t r, uint8_t g, uint8_t b);


private:
	uint8_t _pin, _numpixels;
	uint8_t _old_secs = 0;

	timer _time;

};

#endif
