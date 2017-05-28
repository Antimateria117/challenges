#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
using namespace std;

int main () {
  int n;
  cin >> n;
  vector<int> v_numeros;

  for (int i=0;i<n;i++){
    v_numeros.clear();
    long int a;
    cin >> a;
    while (a != 0){
      v_numeros.push_back(a);
      cin >> a;
    }
    sort (v_numeros.begin(), v_numeros.end());
    long int mayor = v_numeros.back();
    long int menor = v_numeros.front();
    int veces_mayor = 0;
    int veces_menor = 0;
    for (vector<int>::iterator it=v_numeros.begin();it!=v_numeros.end();++it){
      if (mayor == *it)
        veces_mayor++;
      if (menor == *it)
        veces_menor++;
    }
    cout << menor << " " << veces_menor << " " << mayor << " " << veces_mayor << "\n";
  }

  return 0;
}
