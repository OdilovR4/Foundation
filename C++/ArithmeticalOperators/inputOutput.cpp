// 1- mavzu Kiritish , chiqarish va ozlashtirish operatoriga doir masalalar  
#include<iostream>
#include<cmath>
using namespace std;
int main(){
// Begin 1 && Begin 2 
/* int a,s,p;
cout<<" a = "; cin>>a;
p=4*a; cout<<" kvadrat peremetri "<<p<<endl;
s=a*a; cout<<" kvadrat yuzi "<<s<<endl; */
	
//	Begin3 
/*int a,b,p,s;
cout<<" a = "; cin>>a;
cout<<" b = "; cin>>b;
p=2*(a+b); cout<<" tortburchak peremetri "<<p<<endl;
s=a*b;  cout<<" tortburchak yuzi "<<s<<endl; */

//Begin 4 
/*int d; 
float l, pi=3.14;
cout<<" aylana diametri = "; cin>>d;
l=pi*d; cout<<" aylana uzunligi "<<l<<endl; */

//Begin 5
/*int a,v,s;
cout<<" a = "; cin>>a;
v=a*a*a; cout<<" kubning hajmi "<<v<<endl;
s=6*a*a; cout<<" kubning tola sirti  "<<s<<endl; */

//Begin 6
/*int a,b,c,v,s;
cout<<" a = "; cin>>a;
cout<<" b = "; cin>>b;
cout<<" c = "; cin>>c;
v=a*b*c; cout<<" paralelopiped hajmi "<<v<<endl;
s=2*(a*b+a*c+b*c);  cout<<" paralelopiped tola sirti "<<s<<endl; */

//Begin 7
/*int r;
float pi=3.14 , l,s;
cout<<" R = "; cin>>r;
l=2*pi*r; cout<<" Doira uzunligi "<<l<<endl;
s=pi*r*r; cout<<" Doira yuzi "<<s<<endl; */

//Begin 8
/*int a,b;
cout<<" a = "; cin>>a;
cout<<" b = "; cin>>b;
cout<<" orta arifmetigi "<<(a+b)/2<<endl; */

//Begin 9 
/*int a,b;
cout<<" a = "; cin>>a;
cout<<" b = "; cin>>b;
cout<<" orta geometrigi "<<sqrt(a*b)<<endl; */

//Begin 10 && Begin 11 
/*int a,b;
cout<<" a = "; cin>>a;
cout<<" b = "; cin>>b;
cout<<" yigindisi "<<a+b<<endl;
cout<<" kopaytmasi "<<a*b<<endl;
cout<<" 1-son kvadrati "<<a*a<<endl;
cout<<" 2-son kvadrati "<<b*b<<endl;
cout<<" 1-son moduli "<<abs(a)<<endl;
cout<<" 2-son moduli "<<fabs(b)<<endl; */

//Begin 12 
/*int a,b;
float c,p;
cout<<" a = "; cin>>a;
cout<<" b = "; cin>>b;
c=sqrt(pow(a,2)+pow(b,2)); cout<<" gipotenuza "<<c<<endl;
p=a+b+c; cout<<" peremetri "<<p<<endl; */

//Begin 13 
/*int R1,R2;
float pi=3.14,S1,S2,S3;
cout<<" R1 = "; cin>>R1;
cout<<" R2 = "; cin>>R2;
S1=pi*pow(R1,2); cout<<" 1 - aylana yuzi "<<S1<<endl;
S2=pi*pow(R2,2); cout<<" 2 - aylana yuzi "<<S2<<endl;
S3=S1-S2; cout<<" yuzalar farqi "<<S3<<endl; */

//Begin 14 
/*float pi=3.14,r,L,S;
cout<<" L = "; cin>>L;
r=L/(2*pi); cout<<" Radiusi "<<r<<endl;
S=pi*r*r;  cout<<" yuzi "<<S<<endl; */

//Begin 15
/*float s,pi=3.14,d,r;
cout<<" s = "; cin>>s;
r=sqrt(s/pi); cout<<" radiusi "<<r<<endl;
d=2*r; cout<<" diametri "<<d<<endl; */

//Begin 16 
/*float X1,X2;
cout<<" X1 = "; cin>>X1;
cout<<" X2 = "; cin>>X2;
cout<<" orasidagi masofa "<<abs(X1-X2)<<endl; */

//Begin 17 
/*float A,B,C;
cout<<" A = "; cin>>A;
cout<<" B = "; cin>>B;
cout<<" C = "; cin>>C;
cout<<" AC kesma uzunligi "<<abs(C-A)<<endl;
cout<<" BC kesma uzunligi "<<abs(C-B)<<endl;
cout<<" AC va BC kesma yigindisi "<<abs(C-A)+abs(C-B)<<endl; */

//Begin 18 
/*float A,B,C;
cout<<" A = "; cin>>A;
cout<<" B = "; cin>>B;
cout<<" C = "; cin>>C;
cout<<" AC kesma uzunligi "<<abs(C-A)<<endl;
cout<<" BC kesma uzunligi "<<abs(C-B)<<endl;
cout<<" AC va BC kesma yigindisi "<<abs(C-A)*abs(C-B)<<endl; */

//Begin 19 
/*int X1=0,Y2=0,X2,Y1;
cout<<" Y1 = "; cin>>Y1;
cout<<" X2 = "; cin>>X2;

cout<<" tortburchak yuzi "<<Y1*X2<<endl; */

//Begin 20 
/*float X1,Y1,X2,Y2;
cout<<" X1 = "; cin>>X1;
cout<<" Y1 = "; cin>>Y1;
cout<<" X2 = "; cin>>X2;
cout<<" Y2 = "; cin>>Y2;
cout<<" ikki nuqta orasidagi masofa "<<sqrt(pow((X2-X1),2)+pow((Y2-Y1),2))<<endl; */

//Begin 21 

/*float x1,y1,x2,y2,x3,y3,a,b,c,p,s;
cout<<" x1 = "; cin>>x1; cout<<" y1 = "; cin>>y1;
cout<<" x2 = "; cin>>x2; cout<<" y2 = "; cin>>y2;
cout<<" x3 = "; cin>>x3; cout<<" y3 = "; cin>>y3;
a=sqrt(pow((x1-x2),2)+pow((y1-y2),2)) ; cout<<" a = "<<a<<endl;
b=sqrt(pow((x3-x2),2)+pow((y3-y2),2)) ; cout<<" b = "<<b<<endl;
c=sqrt(pow((x1-x3),2)+pow((y1-y3),2)) ; cout<<" c = "<<c<<endl;
p=(a+b+c)/2; cout<<" peremetri "<<p<<endl;
s=sqrt(p*(p-a)*(p-b)*(p-c)); cout<<" yuzasi "<<s<<endl; */

//Begin 22 

/*int a = 12  , b = 18;
cout<<" a = "<<a<<" b = "<<b<<endl;
a=a+b; 
b=a-b;
a=a-b;
cout<<" a = "<<a<<" b = "<<b<<endl; */

//Begin 23 

/*float a,b,c,d;
cout<<" a = "; cin>>a;
cout<<" b = "; cin>>b;
cout<<" c = "; cin>>c;
 //b = a; c=b ; a=c;
//cout<<" elementary of value "<<" a = "<<a<<" b =  "<<b<<" c =  "<<c<<" "<<endl;
a=a*b; // a=200
b=a/b; // b=10
d=b*c; // d = 300
c=a/b;// c = 20
a=d/b; // a=30
cout<<" finally of value "<<" a = "<<a<<" b =  "<<b<<" c =  "<<c<<" "<<endl;*/

//Begin 24 
/*float a=10,b=20,c=30,d;
//c=a=10;b=c=30;a=b=20;
cout<<" elementary of value "<<" a = "<<a<<" b =  "<<b<<" c =  "<<c<<" "<<endl;
a=a*c; // a = 300
c=a/c; // c = 10
d=b*c; // d = 200
b=a/c; // b = 30
a=d/c; // a = 20
 cout<<" finally of value "<<" a = "<<a<<" b =  "<<b<<" c =  "<<c<<" "<<endl; */

//Begin 25

/*float x,y;
cout<<" x = "; cin>>x; 
y=3*pow(x,6)-6*pow(x,2)-7;
cout<<" y = "<<y<<endl; */

//Begin 26 
/*float x,y;
cout<<" x = "; cin>>x;
y=4*pow((x-3),6)-7*pow((x-3),3)+2;
cout<<" y = "<<y<<endl; */

//Begin 27 
/*float a;
cout<<" A = "; cin>>a;
cout<<" A^2 = "<<pow(a,2)<<endl;
cout<<" A^4 = "<<pow(a,4)<<endl;
cout<<" A^8 = "<<pow(a,8)<<endl;*/

//Begin 28
/*float a;
cout<<" A = "; cin>>a;
cout<<" A^2 = "<<pow(a,2)<<endl;
cout<<" A^3 = "<<pow(a,3)<<endl;
cout<<" A^5 = "<<pow(a,5)<<endl;
cout<<" A^10 = "<<pow(a,10)<<endl;
cout<<" A^15 = "<<pow(a,15)<<endl; */

//Begin 29
/*float a;
cout<<" alfa = "; cin>>a;
cout<<" radianda taqriban "<<a/57<<endl; */

//Begin 30
/*float r;
cout<<" radian "; cin>>r;
cout<<" gradusda = "<<r*57<<endl; */

//Begin 31 && Begin 32
/*float f,s;
cout<<" Farengeyt = "; cin>>f;
s=(f-32)*5/9;
cout<<" selsiy "<<s<<endl; */

//Begin 33
/*float x,a,y;
cout<<" X yani necha kg konfet ->"; cin>>x;
cout<<x<<" kg konfet nech so'm' turadi ->"; cin>>a;
cout<<" 1 kg konfet -> "<<a/x<<" so'm turadi \n"; 
cout<<" Y yani necha kg kerak  "; cin>>y;
cout<<y<<" kg Konfet "<<y*a/x<<" so'm boladi ";*/

//Begin 34 
/*float x,a,y,b;
cout<<" X yani necha kg shokoland kerak -> "; cin>>x;
cout<<x<<" kg shokoland qancha turadi -> "; cin>>a;
cout<<" Y yani necha kg konfet kerak -> "; cin>>y;
cout<<y<<" kg konfet qancha turadi -> "; cin>>b;
//cout<<" 1 kg shokoland "<<a/x<<" so'm bo'ladi \n ";
//cout<<" 1 kg konfet "<<b/y<<" so'm bo'ladi \n ";
cout<<" 1 kg shokoland 1 kg konfetdan "<<a/x - b/y <<" so'mga qimmat "<<endl;*/

//Begin 35 
/*float v,u,t1,t2,a,b,s=0;
cout<<" qayiq tezligini kiriting km/soat da -> "; cin>>v;
cout<<" oqim tezligini kiriting km/soat da -> "; cin>>u;
cout<<" oqim boyicha harakatlanish vaqti soat da "; cin>>t1;
cout<<" oqimga qarshi harakatlanish vaqti soat da "; cin>>t2;
a=(v+u)*t1;
b=(v-u)*t2;
s=a+b;
cout<<" qayiqning yurgan yo'li "<<s<<" km "<<endl;*/

//Begin 36 
/*float v1,v2,t,s;
cout<<" v1 tezlik km/soat da -> "; cin>>v1;
cout<<" v2 tezlik km/soat da -> "; cin>>v2;
cout<<" T vaqt yani uchrashish vaqti soatda -> "; cin>>t;
s=(v1+v2)*t;
cout<<t<<" soatdan keyingi orasidagi masofa "<<s<<" km "<<endl;*/

//Begin 37 
/*float v1,v2,t,s;
cout<<" v1 tezlik km/soat da -> "; cin>>v1;
cout<<" v2 tezlik km/soat da -> "; cin>>v2;
cout<<" T vaqt yani uchrashish vaqti soatda -> "; cin>>t;
s=abs((v1-v2))*t;
cout<<t<<" soatdan keyingi orasidagi masofa "<<s<<" km "<<endl;*/

//Begin 38 
/*cout<<" A*X+B=0 tenglama berilgan (A!=0) X ni toping \n";
float a,x,b;
cout<<" A ni kiriting -> "; cin>>a;
cout<<" B ni kiriting -> "; cin>>b;
x=-b/a; 
cout<<" X = "<<x<<endl; */

//Begin 39 
/*cout<<" A*X^2 + B*X + C kvadrat tenglama D>0 ko'rinishida X1 va X2 ni topish \n";
float a,b,c,x1,x2,d;
cout<<" A ni kiriting -> "; cin>>a;
cout<<" B ni kiriting -> "; cin>>b;
cout<<" C ni kiriting -> "; cin>>c;
d=b*b-4*a*c;
x1=(-b-sqrt(d))/2;
x2=(-b+sqrt(d))/2;
cout<<" X1 = "<<x1<<endl;
cout<<" X2 = "<<x2<<endl; */

//Begin 40 
/*cout<<" A1*x+B1*Y=C1 va A2*x+B2*Y=C2 chiziqli tenglamalar sistemasi berilgan X va Y topilsin \n";
float a1,b1,c1,a2,b2,c2,x,y,k,l,d;
cout<<" A1 ni kiriting -> "; cin>>a1;
cout<<" B1 ni kiriting -> "; cin>>b1;
cout<<" C1 ni kiriting -> "; cin>>c1;
cout<<" A2 ni kiriting -> "; cin>>a2;
cout<<" B2 ni kiriting -> "; cin>>b2;
cout<<" C2 ni kiriting -> "; cin>>c2;
cout<<"("<<a1<<")X+("<<b1<<")Y = "<<c1<<endl;
cout<<"("<<a2<<")X+("<<b2<<")Y = "<<c2<<endl;
d=a1*b2-a2*b1;
k=c1*b2-c2*b1;
l=a1*c2-a2*c1;
x=k/d; y=l/d;
cout<<" X = "<<x<<endl; 
cout<<" Y = "<<y<<endl;
// Chiziqli tenglamalar sistemasi Kramer usulida yechildi ! */

}
//by Rahmatullo Odilov. Faculty of KiF 221-21 of group . Thanks for your attention 
