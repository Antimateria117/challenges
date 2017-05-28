#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

void resuelve () {
  int n;
  cin >> n;
  if (n==6174){
    cout << 0 << "\n";
  }else{
    vector<int> array;
    for (int i=0;i<4;i++){
      array.push_back(n%10);
      n=n/10;
    }
    sort(array.begin(), array.end());
    int menor = 0;
    for (vector<int>::iterator it=array.begin(); it!=array.end(); ++it){
      menor = (menor + *it)*10;
    }
    menor = menor/10;
    int mayor = 0;
    for (vector<int>::iterator it=array.end(); it!=array.begin(); --it){
      mayor = (mayor + *it)*10;
    }
    vector<int>::iterator it=array.begin();
    mayor = mayor+*it;
    if (mayor == menor){
      cout << 8 << "\n";
    }else{
      int contador = 0;
      while ((mayor - menor) != 6174){
        array.clear();
        n = mayor - menor;
        for (int i=0;i<4;i++){
          array.push_back(n%10);
          n=n/10;
        }
        sort(array.begin(), array.end());
        menor = 0;
        for (vector<int>::iterator it=array.begin(); it!=array.end(); ++it){
          menor = (menor + *it)*10;
        }
        menor = menor/10;
        mayor = 0;
        for (vector<int>::iterator it=array.end(); it!=array.begin(); --it){
          mayor = (mayor + *it)*10;
        }
        vector<int>::iterator it=array.begin();
        mayor = mayor+*it;
        contador++;
      }
    contador++;
    cout << contador << "\n";
    }
  }

}

int main () {
  int ncasos;
  cin >> ncasos;
  for (int i=0;i<ncasos;i++)
    resuelve();
  return 0;
}
