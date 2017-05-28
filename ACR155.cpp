#include <iostream>
using namespace std;

int main () {
  int a, b;
  cin >> a;
  cin >> b;
  while (a>=0 && b>=0){
    cout << 2*a+2*b << "\n";
    cin >> a;
    cin >> b;
  }
  return 0;
}
