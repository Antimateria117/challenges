#include <iostream>
#include <cmath>

using namespace std;

int f (int n){
	return (n*n + 4*n);
}

void resuelve (int n){
	int i=0, cuadrado=0, suma=0;
		while (n-cuadrado != 0){
			while (i*i<=n){
				cuadrado = i*i;
				i++;
			}
			i=0;
			if (suma != 1){
				suma = suma + f(int(sqrt(cuadrado)));
			}else{
				suma = suma + 5;
			}
			n = n - cuadrado;
			cuadrado = 0;
		}
		if (suma != 0)
			cout << suma << endl;
		suma = 0;
	}

int main () {
	int n;
	cin >> n;
	while (n != 0){
		if (n>=1 || n<=10000000){
				resuelve(n);
		}
		cin >> n;
	}
	return 0;
}
