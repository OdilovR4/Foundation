//Rahmatullo Odilov 
//10-fevral 2024-yil
//Shart operatoriga oid
#include<iostream>
#include<cmath>
using namespace std;
int main(){
 /*	//if1
	int a, s=0;
	cout<<" a = "; cin>>a;
	if(a>0){
		s=a+1;
	cout<<s<<endl;
    }
	else 
	cout<<a<<endl; */
	
 /*	//if2
	int a, s=0;
	cout<<" a = "; cin>>a;
	if(a>0){
		s=a+1;
		cout<<s<<endl;
	}
	else{ 
	s=a-2;
	cout<<s<<endl;
    } */
    
 /* //if3
	int a, s=0;
	cout<<" a = "; cin>>a;
	if(a>0){
		s=a+1;
		cout<<s<<endl;
	}
	else if(a<0){ 
	s=a-2;
	cout<<s<<endl;
    } 
    else 
    cout<<" 10 "<<endl; */
    
    //if4 (if5 - misol ham if4 ga teng)
 /* int a, b, c;
    cout<<"a = "; cin>>a;
    cout<<"b = "; cin>>b;
    cout<<"c = "; cin>>c;
    if(a>0 && b>0 && c>0)
    cout<<" 3 ta musbat son bor "<<endl;
    else if ((a>0 && b>0 && c<0) || (a>0 && b<0 && c>0)||(a<0 && b>0 && c>0))
    cout<<" 2 ta musbat son bor "<<endl;
    else if(( a>0 && b<0 && c<0) || (a<0 && b>0 && c<0) || (a<0 && b<0 && c>0))
    cout<<" 1 ta musbat son bor "<<endl;
    else 
    cout<<" musbat son yo'q "<<endl; */
    
 /* //if5
    int a, b, c, k=0, m=0;
    cout<<" a = "; cin>>a;
    if(a>0){
    k++; }
    else {
    m++; }
    cout<<" b = "; cin>>b;
    if(b>0){
    	k++;
	}
    else {
    	m++;
	}
    cout<<" c = "; cin>>c;
    if(c>0){
    	k++;
	}
	else {
		m++;
	}
	 if(k==0){
		cout<<m<<" ta manfiy son bor \n ";
	}
	else if(m==0){
		cout<<k<<" ta musbat son bor \n ";
	}
	else {
	cout<<k<<" ta musbat son bor \n ";
	cout<<m<<" ta manfiy son bor \n ";
    } */
    
 /*   //if6
    int a, b, max;
    cout<<" a = "; cin>>a;
    cout<<" b= "; cin>>b;
    max = a>b? a : b;
    cout<<" max "<<max<<endl; */
    
 /* //if7
    int a, b;
    cout<<" a = "; cin>>a;
    cout<<" b= ";  cin>>b;
	a>b?cout<<" 1 "<<endl
	:cout<<" 2 "<<endl; */
	
 /* //if8
	int a, b;
    cout<<" a = "; cin>>a;
    cout<<" b= ";  cin>>b;
    a>b? cout<<" max - "<<a<<endl<<" min - "<<b<<endl
    :  cout<<" max - "<<b<<endl<<" min - "<<a<<endl; */
    
 /* //if9
    int A, B;
    cout<<" A = "; cin>>A;
    cout<<" B = "; cin>>B;
    if(A>B){
    	A=A*B;
    	B=A/B;
    	A=A/B;
    	cout<<" A = "<<A<<endl<<" B = "<<B<<endl;
	}
	else 
		cout<<" A = "<<A<<endl<<" B = "<<B<<endl; */
	
 /*	//if10
	int A, B;
    cout<<" A = "; cin>>A;
    cout<<" B = "; cin>>B;
    if(A!=B){
    	A=A+B;
        B=A;
    	cout<<" A = "<<A<<endl<<" B = "<<B<<endl; 	
	}
	else {
	A=0;
	B=0;
	cout<<" A = "<<A<<endl<<" B = "<<B<<endl; 	 } */
	
/*	//if11
	int A, B;
    cout<<" A = "; cin>>A;
    cout<<" B = "; cin>>B;
    if(A!=B && A>B){
    	B=A;
    cout<<" A = "<<A<<endl<<" B = "<<B<<endl;	
	}
	else if(A==B) {
	A=0;
	B=0;
	cout<<" A = "<<A<<endl<<" B = "<<B<<endl; 	 }
	else {
		A=B;
	cout<<" A = "<<A<<endl<<" B = "<<B<<endl;	
	} */
	
/*	//if12
	int a, b, c, min;
	cout<<" a = "; cin>>a;
	cout<<" b = "; cin>>b;
	cout<<" c = "; cin>>c;
	if(a>b && b<c){
		min = b;
		cout<<" min - "<<min<<endl;
	}
	else if(b>c && c<a){
		min = c;
		cout<<" min - "<<min<<endl;
	}
	else if (c>a && a<b){
		min = a;
		cout<<" min - "<<min<<endl;
	} */
	
 /*	//if 13
	int a, b, c, average;
	cout<<" a = "; cin>>a;
	cout<<" b = "; cin>>b;
	cout<<" c = "; cin>>c;
	if((a>b && a<c) || (a>c && a<b)){
		average = a;
		cout<<" average - "<<average<<endl;
	}
	else if((b>a && b<c) || (b>c && b<a)){
		average = b;
		cout<<" average - "<<average<<endl;
	}
	else if ((c>b && c<a) || (c>a && c<b)){
	    average = c;
	   	cout<<" average - "<<average<<endl;
    } */
    
 /*  //if14
    int a, b, c, min;
	cout<<" a = "; cin>>a;
	cout<<" b = "; cin>>b;
	cout<<" c = "; cin>>c;
    if(a<= b && a<=c)
    cout<<" min -> "<<a<<endl;
    else if(b<= a && b<=c)
    cout<<" min -> "<<b<<endl;
    else if( c<= a && c<=b)
    cout<<" min -> "<<c<<endl;

    if(a>=b && a>=c)
    cout<<" max : "<<a<<endl;
    else if(b>=a && b>=c)
    cout<<" max : "<<b<<endl;
    else if(c>=a && c>=b)
    cout<<" max : "<<c<<endl; */
    
 /*  //if15
    int a, b, c, s=0;
	cout<<" a = "; cin>>a;
	cout<<" b = "; cin>>b;
	cout<<" c = "; cin>>c;
	if(a>b && b<c){
		s=a+c;
		cout<<" summa = "<<s<<endl;
		cout<<" eng katta sonlar \n "<<a<<endl<<c<<endl;
	}
    else if (b>a && a<c){
    	s=b+c;
		cout<<" summa = "<<s<<endl;
		cout<<" eng katta sonlar \n "<<b<<endl<<c<<endl;
	}
    else if(a>c && c<b){
    	s=a+b;
		cout<<" summa = "<<s<<endl;
		cout<<" eng katta sonlar \n "<<a<<endl<<b<<endl;
	} */
	
/*	//if16
	int a, b, c, s=0;
	cout<<" a = "; cin>>a;
	cout<<" b = "; cin>>b;
	cout<<" c = "; cin>>c;
    if(a < b && b < c ){
    	cout<<" a = "<<2*a<<endl;
    		cout<<" b = "<<2*b<<endl;
    			cout<<" c = "<<2*c<<endl;
    	}
    else {
    	cout<<" a = "<<-a<<endl;
    		cout<<" b = "<<-b<<endl;
    			cout<<" c = "<<-c<<endl;
        } */
        
 /* //if17
    int a, b, c, s=0;
	cout<<" a = "; cin>>a;
	cout<<" b = "; cin>>b;
	cout<<" c = "; cin>>c;
    if((a < b && b < c) || (a>b && b>c) ){
    	cout<<" a = "<<2*a<<endl;
    		cout<<" b = "<<2*b<<endl;
    			cout<<" c = "<<2*c<<endl;
    	}
    else {
    	cout<<" a = "<<-a<<endl;
    		cout<<" b = "<<-b<<endl;
    			cout<<" c = "<<-c<<endl;
        } */
        
/*    //if18
    int a, b, c;
	cout<<" a = "; cin>>a;
	cout<<" b = "; cin>>b;
	cout<<" c = "; cin>>c;
	if(a==b && a!=c)
	cout<<" 3 "<<endl;
	else if(a==c && a!=b)
	cout<<" 2 "<<endl;
	else if(b==c && b!=a)
	cout<<" 1 "<<endl;
	else if(a==b && b==c && a==c)
	cout<<" barcha son bir biriga teng "<<endl;
    else 
    cout<<" 2 ta son bir biriga teng emas \n "; */
    
 /* //if19
    int a, b, c, d;
	cout<<" a = "; cin>>a;
	cout<<" b = "; cin>>b;
	cout<<" c = "; cin>>c;
	cout<<" d = "; cin>>d;
	if(a==b && b==c && a!=d)
	cout<<" 4 \n ";
	else if(a==b && b==d && b!=c)
	cout<<" 3 \n ";
	else if(a==c && c==d && d!=b)
	cout<<" 2 \n ";
	else if( b==c && c==d && c!=a) 
	cout<<" 1 \n "; 
	else if(a==b && b==c && c==d)
	cout<<" barcha son bir biriga teng \n";
	else 
	cout<<" 3 ta son bir biriga teng emas \n"; */
	
 /*	//if20
	int a,b,c;
	cout<<" a = "; cin>>a;
	cout<<" b = "; cin>>b;
	cout<<" c = "; cin>>c;
	if(abs(a-b)<abs(a-c)){
		cout<<" a nuqtaga eng yaqin nuqta b va orasidagi masofa "<<abs(a-b)<<endl;
	}
	else if (abs(a-c)<abs(a-b)){
		cout<<" a nuqtaga eng yaqin nuqta c va orasidagi masofa "<<abs(a-c)<<endl;
	}
	else if(abs(a-c)==abs(a-b) && a!=b && b==c)
    cout<<" a nuqtaga eng yaqin nuqta c va b va orasidagi masofa "<<abs(a-c)<<endl;
    else 
    cout<<" barchasi bir nuqtada yotadi orasidagi masofa 0 ga teng \n "; */
    
 /* //if21
    int x, y;
    cin>>x>>y;
    if(x==0 && y==0)
    cout<<"0 \n";
    else if(x!=0 && y==0)
    cout<<"1 \n";
    else if(x==0 && y!=0)
    cout<<"2 \n ";
    else 
    cout<<"3 \n"; */
    
 /*  //if22
    int x, y;
    cout<<" x = "; cin>>x;
    cout<<" y = "; cin>>y;
    if(x>0 && y>0)
    cout<<" 1-chorak \n ";
    else if(x>0 && y<0)
    cout<<" 4-chorak \n ";
    else if(x<0 && y>0)
    cout<<" 2- chorak \n";
    else if(x<0 && y<0)
    cout<<" 3 - chorak \n";
    else 
    cout<<" berilgan nuqta hech qaysi chorakda yotmaydi \n"; */
    
  /*  //if23 chala
    int x1, y1, x2, y2, x3, y3, x4, y4;
    cout<<" x1 = "; cin>>x1;
    cout<<" y1 = "; cin>>y1;
    cout<<" x2 = "; cin>>x2;
    cout<<" y2 = "; cin>>y2;
    cout<<" x3 = "; cin>>x3;
    cout<<" y3 = "; cin>>y3;
    if(){
    	cout<<" 4-nuqta kordinatalari \n ";
    	cout<<" x4 = "<<x3<<endl;
    	
	} */
	
 /*	//if24
	float x, y;
	cout<<" x = "; cin>>x;
	y=x>0? 2*sin(x) : x-6;
	cout<<" y = "<<y<<endl; */
	
 /*	//if25
	float x, y;
	cout<<" x = "; cin>>x;
    y=(x<-2 || x>2)? 2*x:-3*x;
    cout<<" y = "<<y<<endl; */
    
 /* //if26
    float x, y;
	cout<<" x = "; cin>>x;
	if(x<=0){
		y = -x;
		cout<<" y = "<<y<<endl;
	}
	else if(x>0 && x<2){
		y = x*x;
		cout<<" y = "<<y<<endl;
	}
	else
	cout<<" y = 4 \n "; */
	
/*	//if27
	float x, y;
	int a = static_cast<int>(x);
	cout<<" x = "; cin>>x;
	a=floor(x);
	if(x<0){
		cout<<" y = 0"<<endl;
	}
	else if(a%2==0){
		cout<<" y = 1 "<<endl;
	}
	else
	cout<<" y = -1 \n "; */
	
 /* //if28
   int x;
   cout<<" yilni kiriting "; cin>>x;
   if(x%100 == 0 && x%400  == 0 && x%4==0){
   	cout<<" 366 kun bor \n";
   } 
   else if(x%100!=0 && x%4==0){
   	cout<<" 366 kun bor \n";
   }
    else 
    cout<<" 365 kun bor \n"; */
    
 /* //if29
    int x;
    cout<<" x = "; cin>>x;
    if(x<0 && x%2==-1){
    	cout<<" manfiy toq son \n";
	}
     else if(x>0 && x%2==1){
    	cout<<" musbat toq son \n";
	}  else if(x>0 && x%2==0){
    	cout<<" musbat juft son \n";
	}
     else if(x<0 && x%2==0){
    	cout<<" manfiy juft son \n";
	}
    else 
    cout<<" 0 ga teng son \n"; */
    
 /* //if30
    int x;
    cout<<" 1 dan 999 oraliqgacha son kiriting - "; cin>>x;
    if(x<10 and x%2==0){
    	cout<<" 1 xonali juft son \n";
	}
    else if(x<10 and x%2!=0){
    	cout<<" 1 xonali toq son \n";
	}
    else if(x>9 and x<100 and x%2==0){
    	cout<<" 2 xonali juft son \n";
	}
	  else if(x>9 and x<100 and x%2==1){
    	cout<<" 2 xonali toq son \n";
	}
      else if(x>99 and x<1000 and x%2==0){
    	cout<<" 3 xonali juft son \n";
	}
      else if(x>99 and x<1000 and x%2==1){
    	cout<<" 3 xonali toq son \n";
	}
	else
	cout<<" kiritilgan son 3 xonali emas \n "; */
	
	main();
}
