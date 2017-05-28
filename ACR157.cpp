#include <iostream>
using namespace std;

int main () {
  int n;
  cin >> n;
  int d,m;
  int dias [12] = {31,28,31,30,31,30,31,31,30,31,30,31};
  for (int i=0;i<n;i++){
    cin >> d;
    cin >> m;
    int j=m;
    int acumulador = 0;
    while (j<12){
      acumulador = acumulador + dias[j];
      j++;
    }
    acumulador = acumulador + (dias[m-1]-d);
    cout << acumulador << "\n";
  }
  return 0;
}
