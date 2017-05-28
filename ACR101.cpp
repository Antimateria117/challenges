#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

void resuelve (int n) {
  int v[n][n];
  for (int i=0;i<n;i++){
    for (int j=0;j<n;j++){
      cin >> v[i][j];
    }
  }

  int suma_columnas [n];
  int suma_filas [n];
  int suma_diagonal_1 = 0;
  int suma_diagonal_2 = 0;

  for (int i=0;i<n;i++){
    suma_columnas[i]=0;
    suma_filas[i]=0;
  }

  for(int i=0;i<n;i++){
    for (int j=0;j<n;j++){
      suma_columnas[i]=suma_columnas[i]+v[j][i];
      suma_filas[i]=suma_filas[i]+v[i][j];
      if (i==j)
        suma_diagonal_1=suma_diagonal_1+v[i][j];
    }
  }

  int a=0,b=n-1;
  for (int i=0;i<n;i++){
    suma_diagonal_2=suma_diagonal_2+v[a][b];
    a++;
    b--;
  }

  vector<int> v_suma_filas(suma_filas, suma_filas+n);
  vector<int> v_suma_columnas(suma_columnas, suma_columnas+n);
  vector<int> v_suma_diagonales;
  int suma_diagonales [2] = {suma_diagonal_1, suma_diagonal_2};
  v_suma_diagonales.push_back(suma_diagonal_1);
  v_suma_diagonales.push_back(suma_diagonal_2);
  bool diabolico;
  bool esoterico;
  if ((suma_diagonal_1 == suma_diagonal_2) && equal(v_suma_columnas.begin(), v_suma_columnas.end(), suma_filas) && equal(v_suma_filas.begin(), v_suma_filas.end(), suma_columnas)) {
    diabolico = true;
    esoterico = false;
    cout << "DIABOLICO" << "\n"

  }else{
    cout << "NO" << "\n";
  }
}

int main () {
  int n;
  cin >> n;
  while (n != 0){
    resuelve(n);
    cin >> n;
  }
  return 0;
}
