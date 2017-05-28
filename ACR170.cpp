#include <iostream>
#include <cmath>

using namespace std;

int main () {
	int n, lado;
	cin >> n;
	while (n != 0) {

		lado = (-1+sqrt(1+(8*n)))/2;
		cout << lado << " " << n-((lado*(lado+1))/2) << endl;
		cin >> n;
	}
	return 0;
}
