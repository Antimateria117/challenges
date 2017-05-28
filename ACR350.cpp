#include <iostream>
#include <cstdio>
#include <cmath>

using namespace std;

double const pi = 3.141592654;

int main () {
	int a,b;
	double area1, area2, areaMax;
	cin >> a >> b;
	while (a != 0 && b != 0) {
		area1 = 0.5*a*b*cos((pi/2)/180);
		area2 = 0.5*a*b*cos((3*pi/2)/180);
		areaMax = fmax(area1, area2);
		printf("%f\n", areaMax);
		cin >> a >> b;
	}
	return 0;
}
