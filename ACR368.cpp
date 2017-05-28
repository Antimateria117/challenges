#include <iostream>
using namespace std;

int main () {
  int a,b;
  cin >> a;
  cin >> b;
  while (a>0 && b>0) {
    int tiempo = (a/b)*10;
    if (a%b != 0) {
      tiempo = tiempo + 10;
    }
    cout << tiempo << "\n";
    cin >> a;
    cin >> b;
  }
  return 0;
}
