#include <iostream>
using namespace std;

int main () {
  int n;
  cin >> n;
  while (n!=0){
    int acumulador = 0;
    for (int i=n;i>=0;i--){
      acumulador = acumulador + (i + 2*i);
    }
    cout << acumulador << "\n";
    cin >> n;
  }
  return 0;
}
