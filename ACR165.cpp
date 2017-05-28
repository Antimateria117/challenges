#include <iostream>

using namespace std;

void resuelve (int n) {
	bool a = true;
	while (n/10 != 0 && a==true){
		if ((n%10)%2 != 0){
			a=false;
		}
		n = n/10;
	}
	if (a == true && n%2 == 0){cout << "SI\n";}else{cout << "NO\n";}
}

int main () {
	int n;
	cin >> n;
	while (n>=0 && n <= 1000000000){
		resuelve(n);
		cin >> n;
	}
	return 0;
}
