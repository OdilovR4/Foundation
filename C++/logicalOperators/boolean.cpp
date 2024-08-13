#include<iostream>
#include<cmath>
using namespace std;
int main(){
// Boolean 1
/*bool b; int a;
cout<<" A musbat sonini kiriting -> "; cin>>a;
b=0<a; 
cout<<boolalpha<<b<<endl; */

// Boolean 2
/*bool b; int a;
cout<<" A toq sonini kiriting -> "; cin>>a;
b=a%2;
cout<<boolalpha<<b<<endl; */

// Boolean 3
/*bool b,c; int a;
cout<<" A juft sonini kiriting -> "; cin>>a;
b=a%2;
cout<<boolalpha<<!b<<endl; */

// Boolean 4
/*int a,b; bool c;
cout<<" A = "; cin>>a;
cout<<" B = "; cin>>b;
c=( a>2 && b<=3);
cout<<c<<endl; */

// Boolean 5
/*int a,b; bool c;
cout<<" A = "; cin>>a;
cout<<" B = "; cin>>b;
c=( a>=0 && b<-2);
cout<<c<<endl; */

// Boolean 6
/*int a,b,c; bool d;
cout<<" A = "; cin>>a;
cout<<" B = "; cin>>b;
cout<<" C = "; cin>>c;
d=( a<=b && b<=c);
cout<<d<<endl; */

// Boolean 7
/*bool d; int a,b,c;
cout<<" A = "; cin>>a;
cout<<" B = "; cin>>b;
cout<<" C = "; cin>>c;
d = (a<b && b<c);
cout<<d<<endl; */

// Boolean 8
/*bool c; int a,b;
cout<<" A = "; cin>>a;
cout<<" B = "; cin>>b;
c = (a%2 && b%2);
cout<<boolalpha<<c<<endl; */

// Boolean 9
/*bool c; int a,b;
cout<<" A = "; cin>>a;
cout<<" B = "; cin>>b;
c = (a%2 || b%2);
cout<<boolalpha<<c<<endl; */

// Boolean 10 
/*bool c; int a , b;
cout<<" A = "; cin>>a;
cout<<" B = "; cin>>b;
c=(a%2 || b%2 );
cout<<boolalpha<<c<<endl; */

// Boolean 11
/*bool c,h=true; int a , b;
cout<<" A = "; cin>>a;
cout<<" B = "; cin>>b;
c=(a%2 && b%2 || h );
cout<<boolalpha<<c<<endl; */

// Boolean 12 
/*bool d; int a,b,c;
cout<<" A musbat sonini kiriting -> "; cin>>a;
cout<<" B musbat sonini kiriting -> "; cin>>b;
cout<<" C musbat sonini kiriting -> "; cin>>c;
d=(a>0 && b>0 && c>0);
cout<<boolalpha<<d<<endl; */

// Boolean 13
/*bool d,h=true; int a,b,c;
cout<<" A  sonini kiriting -> "; cin>>a;
cout<<" B  sonini kiriting -> "; cin>>b;
cout<<" C  sonini kiriting -> "; cin>>c;
d=((a>0 || (b>0 || c>0 )));
cout<<boolalpha<<d<<endl; */

// Boolean 14 
/*bool d,h=true; int a,b,c;
cout<<" A sonini kiriting -> "; cin>>a;
cout<<" B sonini kiriting -> "; cin>>b;
cout<<" C sonini kiriting -> "; cin>>c;
d=((a>0 && b<0 && c<0 ) || (a<0 && b>0 && c<0 )|| (a<0 && b<0 && c>0 ));
cout<<boolalpha<<d<<endl; 
main(); */

// Boolean 15 
/*bool d; int a,b,c;
cout<<" A sonini kiriting -> "; cin>>a;
cout<<" B sonini kiriting -> "; cin>>b;
cout<<" C sonini kiriting -> "; cin>>c;
d=((a>0 && b>0 && c<0 ) || (a<0 && b>0 && c>0 )|| (a>0 && b<0 && c>0 ));
cout<<boolalpha<<d<<endl; 
main(); */

// Boolean 16
/*bool a; int b;
cout<<" 2 xonali sonni kiriting -> "; cin>>b;
a=((b>9 && b<100) && b%2==0);
cout<<boolalpha<<a<<endl;
main(); */

// Boolean 17
/*bool a; int b;
cout<<" 3 xonali toq son kiriting -> "; cin>>b;
a=(b>99 && b<1000 && b%2==1);
cout<<" "<<a<<endl;
main(); */

// Boolean 18 
/*bool g; int b,c,a;
cout<<" 1- sonni kiriting -> "; cin>>a;
cout<<" 2- sonni kiriting -> "; cin>>b;
cout<<" 3- sonni kiriting -> "; cin>>c;
g=( a == b || a == c  || b == c );
cout<<boolalpha<<g<<endl;
main(); */

// Boolean 19
/*bool g; int b,c,a;
cout<<" 1- sonni kiriting -> "; cin>>a;
cout<<" 2- sonni kiriting -> "; cin>>b;
cout<<" 3- sonni kiriting -> "; cin>>c;
g=( a + b == 0 || a + c == 0  || b + c == 0 );
cout<<boolalpha<<g<<endl;
main(); */

// Boolean 20
/*bool g; int b,c,a;
cout<<" 1- sonni kiriting -> "; cin>>a;
cout<<" 2- sonni kiriting -> "; cin>>b;
cout<<" 3- sonni kiriting -> "; cin>>c;
g=( a != b && a != c  && b != c );
cout<<boolalpha<<g<<endl;
main(); */

// Boolean 21
/*bool g; int b,c,a;
cout<<" 1- sonni kiriting -> "; cin>>a;
cout<<" 2- sonni kiriting -> "; cin>>b;
cout<<" 3- sonni kiriting -> "; cin>>c;
g=( a <= b && a <= c  && b <= c );
cout<<boolalpha<<g<<endl;
main(); */

// Boolean 22
/*bool g; int b,c,a;
cout<<" 1- sonni kiriting -> "; cin>>a;
cout<<" 2- sonni kiriting -> "; cin>>b;
cout<<" 3- sonni kiriting -> "; cin>>c;
g=( (a <= b && a <= c  && b <= c ) || (a >= b && a >= c  && b >= c ))  ;
cout<<boolalpha<<g<<endl;
main(); */

// Boolean 23
/*bool g; int a,b,c,d;
cout<<" 3 xonali sonni kiriting -> "; cin>>a;
b=a/100;
c=a/10%10;
d=a%100%10;
//cout<<" "<<b<<" "<<c<<" "<<d<<endl;
g=( b == d);
cout<<boolalpha<<g<<endl;
main(); */

// Boolean 24
/*bool g; int a , b , c , d;
cout<<" A*X*X + B*X + C  haqiqiy ildizga ekanligii tekshiring "<<endl;
cout<<" A = "; cin>>a;
cout<<" B = "; cin>>b;
cout<<" C = "; cin>>c;
cout<<a<<"X*X + ("<<b<<")X + ("<<c<<")"<<endl;
d=b*b-4*a*c;
g=( a!=0 && (d > 0 || d == 0));
cout<<boolalpha<<g<<endl;
main(); */

// Boolean 25
/*bool g; int x,y;
cout<<" X = "; cin>>x;
cout<<" Y = "; cin>>y;
g=(x<0 && y>0 );
cout<<boolalpha<<g<<endl;
main(); */

// Boolean 26
/*bool g; int x,y;
cout<<" X = "; cin>>x;
cout<<" Y = "; cin>>y;
g=(x>0 && y<0 );
cout<<boolalpha<<g<<endl;
main(); */

// Boolean 27
/*bool g; int x,y;
cout<<" x = "; cin>>x;
cout<<" y = "; cin>>y;
g=((x<0 && y<0 )|| (x<0 && y>0));
cout<<boolalpha<<g<<endl;
main(); */

// Boolean 28
/*bool g; int x,y;
cout<<" x = "; cin>>x;
cout<<" y = "; cin>>y;
g=((x>0 && y>0) || (x<0 && y<0 ));
cout<<boolalpha<<g<<endl;
main(); */

// Boolean 29
/*bool g; int x,y,x1,y1,x2,y2;
cout<<" x1 = "; cin>>x1;
cout<<" y1 = "; cin>>y1;
cout<<" x2 = "; cin>>x2;
cout<<" y2 = "; cin>>y2;
cout<<" x = "; cin>>x;
cout<<" y = "; cin>>y;
g = (x<x2 && y<y1);
cout<<boolalpha<<g<<endl;
main(); */

// Boolean 30
/*bool g; int a,b,c;
cout<<" a = "; cin>>a;
cout<<" b = "; cin>>b;
cout<<" c = "; cin>>c;
g=( a == b && a == c && b == c );
cout<<g<<endl;
main();*/

// Boolean 31
/*bool g; int a,b,c;
cout<<" a = "; cin>>a;
cout<<" b = "; cin>>b;
cout<<" c = "; cin>>c;
g=(( a == b || a == c || b == c ) && ( a != b || a != c || b != c ) );
cout<<g<<endl;
main(); */

// Boolean 32 
/*bool g; int a,b,c;
cout<<" a katetni kirit -> "; cin>>a;
cout<<" b katetni kirit -> "; cin>>b;
cout<<" gipotenuzani kiriting toy -> "; cin>>c;
g=(a*a+b*b == c*c);
cout<<g<<endl;
main(); */

// Boolean 33
/*bool g; int a,b,c;
cout<<" a = "; cin>>a;
cout<<" b = "; cin>>b;
cout<<" c = "; cin>>c;
g=(a+b>c && a+c>b && c+b>a);
cout<<boolalpha<<g<<endl;
main(); */

// Boolean 34
/*bool g; int x,y;
cout<<" x = "; cin>>x;
cout<<" y = "; cin>>y;
g=(  ( x % 2 == 0 && y % 2 == 1) ||  ( x % 2 == 1 && y % 2 == 0 ) ) ;
cout<<boolalpha<<g<<endl;
main(); */

// Boolean 35
/*bool g; int x,y,x1,y1;
cout<<" x1 = "; cin>>x;
cout<<" y1 = "; cin>>y;
cout<<" x2 = "; cin>>x1;
cout<<" y2 = "; cin>>y1;
g=( ( ( x % 2 == 0 && y % 2 == 1) ||  ( x % 2 == 1 && y % 2 == 0 ) ) && 
( ( x1 % 2 == 0 && y1 % 2 == 1) ||  ( x1 % 2 == 1 && y1 % 2 == 0 ) ) ||
 ( (x % 2 == 1 && y % 2 == 1 ) || (x % 2 == 0 && y % 2 == 0 ) ) &&  
 ( (x1 % 2 == 0 && y1 % 2 == 0 ) || (x1 % 2 == 1 && y1 % 2 == 1 ) ) ) ;
cout<<boolalpha<<g<<endl;
main(); */

// Boolean 36
/*bool g; int x1,y1,x2,y2;
cout<<" Ruxni dastlabkiu turgan joyini kiriting -> "<<endl;
cout<<" x1 = "; cin>>x1;
cout<<" y1 = "; cin>>y1;
cout<<" Rux bir yurishda maydonning 2 - tomoniga o'tsin -> \n ";
cout<<" x2 = "; cin>>x2;
cout<<" y2 = "; cin>>y2;

g = (x1 == x2 && y2>4 && y2<9);

cout<<boolalpha<<g<<endl;
main(); */

// Boolean 37
/*bool g; int x1,y1 = 4,x2,y2;
cout<<" shohni dastlabkiu turgan joyini kiriting -> "<<endl;
cout<<" x1 = "; cin>>x1;
cout<<" y1 = "; cin>>y1;
cout<<" shoh bir yurishda maydonning 2 - tomoniga o'tsin -> \n ";
cout<<" x2 = "; cin>>x2;
cout<<" y2 = "; cin>>y2;

g = (( x1>0 && x1 < 9 && y1 == 4 ) && ( x2>0 && x2 < 9 && y2 == 5 ));

cout<<boolalpha<<g<<endl;
main(); */

// Boolean 38
bool g; int x1,y1,x2,y2;
cout<<" filni dastlabki turgan joyini kiriting -> "<<endl;
cout<<" x1 = "; cin>>x1;
cout<<" y1 = "; cin>>y1;
cout<<" fil bir yurishda maydonning 2 - tomoniga o'tsin -> \n ";
cout<<" x2 = "; cin>>x2;
cout<<" y2 = "; cin>>y2;

g = (((x1>0 && x1<9 && y1>0 && y1<5 ) && (x2%2 == 1 && y2>4 && x2>0 && x2<9 && y2>4 && y2<9) ) ||
((x1 + y1 == x2 + y2 ) || (x1 + y2 == y1 + x2)) );

cout<<boolalpha<<g<<endl;
main();

// 38 - 40 masalalarga keyin bosh qotiramiz 
	

}
