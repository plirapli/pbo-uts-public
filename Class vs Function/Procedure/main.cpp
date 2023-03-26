#include <iostream>
using namespace std;

void pertambahan(int x, int y, int *c)
{
    *c = x + y;
}

void helloworld()
{
    cout << "Hello World\n";
}

main()
{
    helloworld();
    int hasil = 0;
    pertambahan(10, 10, &hasil);
    cout << "Pertambahan : " << hasil;
}
