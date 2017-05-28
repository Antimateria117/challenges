#include <iostream>
#include <cmath>

using namespace std;

int main () {
	int piscina1,barreno1,pierde1,piscina2,barreno2,pierde2; 
	int viajesVecino1=0;
	int viajesVecino2=0;
	cin >> piscina1;
	while (piscina1 != 0){
		cin >> barreno1 >> pierde1 >> piscina2 >> barreno2 >> pierde2;
		viajesVecino1 = ceil((1.0)*piscina1/(barreno1-pierde1));
		viajesVecino2 = ceil((1.0)*piscina2/(barreno2-pierde2));
		if (viajesVecino1 == viajesVecino2){
			cout << "EMPATE " << viajesVecino1 << endl;
		}else{
			if (viajesVecino1 <= 0){
				cout << "VECINO " << viajesVecino2 << endl;
			}else{
				if (viajesVecino2 <= 0){
					cout << "YO " << viajesVecino1 << endl;
				}else{
					if (viajesVecino1 < viajesVecino2){
						cout << "YO " << viajesVecino1 << endl;
					}else{
						cout << "VECINO " << viajesVecino2 << endl;
					}
				}
			}
		}
		cin >> piscina1;
	}
	return 0;
}
