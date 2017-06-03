#include <iostream>
#include <string>
#include <cmath>

using namespace std;

int main (void) {
  while (true) {
    string frase;
    cin >> frase;

    int numCasos;
    cin >> numCasos;

    if (numCasos == 0) break;

    int i,j = 0;
    string subCadena;
    bool iguales;

    for (int k=0;k<numCasos;k++){
      iguales = true;
      cin >> i >> j;
      subCadena = frase.substr(fmin(i,j), (fmax(i,j)-fmin(i,j))+1);
      char primeraLetra = subCadena[0];
      int a = fmax(i,j)-fmin(i,j);
      while(a>=0){
        if (primeraLetra != subCadena[a]) {
          iguales = false;
          break;
        }
        a--;
      }
      if (iguales)
        cout << "SI" << endl;
      else
        cout << "NO" << endl;
    }
    cout << endl;
    cin.ignore(256, '\n');
  }
  return 0;
}
