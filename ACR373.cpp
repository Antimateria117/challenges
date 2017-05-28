#include <iostream>
using namespace std;

int main () {
  int n;
  cin >> n;
  for (int i=0;i<n;i++){
    long a;
    cin >> a;
    long volG = a*a*a;
    long volP = (a-2)*(a-2)*(a-2);
    long cubos = volG - volP;
    cout << cubos << "\n";
  }
  return 0;
}
