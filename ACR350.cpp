#include <iostream>
#include <cstdio>
#include <cmath>

using namespace std;

double const pi = 3.141592654;

int main () {
	int a,b;
	double area;
	while (cin >> a >> b && a || b) {
		printf("%.1f\n", a*b/2.0);
		cin >> a >> b;
	}
	return 0;
}
