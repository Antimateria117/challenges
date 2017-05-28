#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
using namespace std;

int main () {
  double n;
  cin >> n;
  vector<double> v_numeros;
  double numeros [6];
  while (n != -1) {
    v_numeros.clear();
    for (int i=0;i<6;i++){
      v_numeros.push_back(n);
      numeros[i]=n;
      cin >> n;
    }
    sort(v_numeros.begin(), v_numeros.end());
    double max = v_numeros.back();
    double min = v_numeros.front();
    int dia_max = 0;
    int dia_min = 0;
    double media = 0;
    for(int i=0;i<6;i++){
      if (numeros[i] == max)
        dia_max = i;
      if (numeros[i] == min)
        dia_min = i;
      media = media + numeros[i];
    }
    media = media/6;
    string dia_maximo;
    string dia_minimo;
    switch (dia_max) {
      case 0: dia_maximo = "MARTES"; break;
      case 1: dia_maximo = "MIERCOLES"; break;
      case 2: dia_maximo = "JUEVES"; break;
      case 3: dia_maximo = "VIERNES"; break;
      case 4: dia_maximo = "SABADO"; break;
      case 5: dia_maximo = "DOMINGO"; break;
    }
    switch (dia_min) {
      case 0: dia_minimo = "MARTES"; break;
      case 1: dia_minimo = "MIERCOLES"; break;
      case 2: dia_minimo = "JUEVES"; break;
      case 3: dia_minimo = "VIERNES"; break;
      case 4: dia_minimo = "SABADO"; break;
      case 5: dia_minimo = "DOMINGO"; break;
    }
    cout << dia_maximo << " " << dia_minimo << " ";
    if (numeros[5] > media) {
      cout << "SI" << "\n";
    }else{
      cout << "NO" << "\n";
    }
  }
  return 0;
}
