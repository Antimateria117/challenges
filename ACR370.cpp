#include <iostream>
using namespace std;

int main () {
  int casos;
  cin >> casos;
  for (int i=0;i<casos;i++) {
    int a;
    int b;
    cin >> a;
    cin >> b;
    b = b*-1;
    int mayor, menor;
    if (a>b){
      mayor = a; menor = b;
    }else{
      mayor = b; menor = a;
    }
    if ((mayor - menor == 1) && (menor%2==0)){
      cout << "SI" << "\n";
    }else{
      cout << "NO" << "\n";
    }
  }
  return 0;
}
