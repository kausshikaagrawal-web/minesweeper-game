import java.util.*;
import java.io.*;
class mine
{
public static void main(String args[]) throws Exception
{
DataInputStream ob=new DataInputStream(System.in);
Scanner sc=new Scanner(System.in);
int r , c , n , i , lr , lc , x , x2 , i2 , s=0 , n2=0 , x3 , i3 , pr , pc , dr , dc , fr , fc , p , in , i4 , j4 , s3=0 , ji=0 , j ;
int Arr[][];
double lrd , lrc ;
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println(); 
System.out.println("                                       	 	      ==========================================================");
System.out.println();
System.out.println("                                             		               "+"M I N E S W E E P E R  ");
System.out.println();
System.out.println("                                      	 	      ==========================================================");
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println(" ============================ ");
System.out.println("   INSTRUCTIONS   TO   PLAY  ");
System.out.println(" ============================ ");
System.out.println();
System.out.println();
System.out.println(" 1)    "+"Enter   The   Row   And   Column   Of   The   Arena  .");
System.out.println();
System.out.println(" 2)    "+"Enter   The     Number    Of   BOMBS   You   Want   In   The    Arena  .");
System.out.println();
System.out.println(" 3)    "+"Enter   Whether   You    Want   To   Play   ,  Put   A   Flag   ,  Have   A   Doubt . ");
System.out.println();
System.out.println(" 4)    "+"Flag   -  @");
System.out.println();
System.out.println(" 5)    "+"Doubt  -  ?");   
System.out.println();
System.out.println(" 6)    "+"If   You   Play   And   There   Is   A   Bomb   At   That   Place   Then   THE  GAME  ENDS  .");
System.out.println();
System.out.println(" 7)    "+"After   The   Game   Has   Ended   Total   Points   Will   Be   Displayed   On   The   Screen  .");
System.out.println();
System.out.println(" 8)    "+"If   You   Put   A   Flag   And   There   Is   A   Bomb   Underneath   You   Are   Awarded   25   POINTS   else   There   Is   A   Deduction   Of   25  POINTS");
System.out.println();
System.out.println(" 9)    "+"If   You   Put   A   Doubt   And   There   Is   A   Bomb   Underneath   You   Are   Awarded   10   POINTS   else   There   Is   A   Deduction   Of   10  POINTS");
System.out.println();
System.out.println();
System.out.println();
System.out.println(" 1  -"+"    NEW    GAME");
System.out.println();
System.out.println(" 2  -"+"    CONTINUE    OLD    GAME");
System.out.println();
System.out.print(" ");
System.out.println();
System.out.print(" Your   Input  - ");
int f = sc.nextInt();
System.out.println();
System.out.println();
if(f==1)
{
System.out.println(" Enter   ROWS   And   COLUMNS   Of   The   ARENA  -");
System.out.println();
System.out.print(" ");
r=sc.nextInt(); 
System.out.print(" ");
c=sc.nextInt();
Arr=new int[r][c];
System.out.println();
System.out.println(" Enter   Number   Of   BOMBS  -");
System.out.println();
System.out.print(" ");
n=sc.nextInt();
for(i=0;i<r;i++)
{
for(x=0;x<c;x++)
{
Arr[i][x]=0;
}
}
System.out.println();
for(i=0;i<n;i++)
{
lrd=Math.random()*r;
lrc=Math.random()*c;
lr=(int)lrd;
lc=(int)lrc;
Arr[lr][lc]=10;
}
for(i2=0;i2<r;i2++)
{
for(x2=0;x2<c;x2++)
{
if(Arr[i2][x2]>=10)
{
if(x2>0)
{
Arr[i2][x2-1]++;
}
if(x2<c-1)
{
Arr[i2][x2+1]++;
}
if(i2>0)
{
Arr[i2-1][x2]++;
}
if(i2<r-1)
{
Arr[i2+1][x2]++;
}
if(x2>0 && i2>0)
{
Arr[i2-1][x2-1]++;
}
if((x2<c-1)&&( i2<r-1))
{
Arr[i2+1][x2+1]++;
}
if(x2>0 && i2<r-1)
{
Arr[i2+1][x2-1]++;
}
if(x2<c-1 && i2>0)
{
Arr[i2-1][x2+1]++;
}
}
}
}
String Arr2[][];
Arr2=new String[r][c];
for(i3=0;i3<r;i3++)
{

for(x3=0;x3<c;x3++)
{
Arr2[i3][x3]=" ";
}
}
System.out.println();
System.out.println();
System.out.println(" ===========");
System.out.println("  S T A R T");
System.out.println(" ===========");
System.out.println();
System.out.println();
System.out.println();
for(i3=0;i3<r;i3++)
{
for(x3=0;x3<c;x3++)
{
System.out.print(Arr2[i3][x3]);
System.out.print("|");
}
System.out.print(" ");
System.out.print("|");
System.out.println();
System.out.println();
}
abc: for(in=1;in>0;in++)
{
System.out.println();
System.out.println(" 1 - PLAY ");
System.out.println();
System.out.println(" 2 - FLAG  ( @ ) ");
System.out.println();
System.out.println(" 3 - DOUBT  ( ? ) ");
System.out.println();
System.out.println(" 4 - SAVE  AND  EXIT ");
System.out.println();
System.out.print(" ");
System.out.println();
System.out.print(" Your   Input  -  ");
p=sc.nextInt();
System.out.println();
System.out.println();

if(p==1)
{
System.out.println(" Row   Number   To   PLAY  -");
System.out.println();
System.out.print(" ");
pr=sc.nextInt();
pr=pr-1;
System.out.println();
System.out.println(" Column   Number   To   PLAY  -");
System.out.println();
System.out.print(" ");
pc=sc.nextInt();
System.out.println();
System.out.println();
pc=pc-1;
if(Arr[pr][pc]>=10)
{
Arr2[pr][pc]="10";
break abc;
}
if(Arr[pr][pc]==0)
{
Arr2[pr][pc]="0";
}
if(Arr[pr][pc]==1)
{
Arr2[pr][pc]="1";
}
if(Arr[pr][pc]==2)
{
Arr2[pr][pc]="2";
}
if(Arr[pr][pc]==3)
{
Arr2[pr][pc]="3";
}
if(Arr[pr][pc]==4)
{
Arr2[pr][pc]="4";
}
if(Arr[pr][pc]==5)
{
Arr2[pr][pc]="5";
}
if(Arr[pr][pc]==6)
{
Arr2[pr][pc]="6";
}
if(Arr[pr][pc]==7)
{
Arr2[pr][pc]="7";
}
if(Arr[pr][pc]==8)
{
Arr2[pr][pc]="8";
}
}
if(p==2)
{
System.out.println(" Row   Number   Of   FLAG  - ");
System.out.println();
System.out.print(" ");
fr=sc.nextInt();
fr=fr-1;
System.out.println();
System.out.println(" Column   Number   Of   FLAG  -");
System.out.println();
System.out.print(" ");
fc=sc.nextInt();
System.out.println();
System.out.println();
fc=fc-1;
Arr2[fr][fc]="@";
}
if(p==3)
{
System.out.println(" Row   Number   Of   DOUBT  - ");
System.out.println();
System.out.print(" ");
dr=sc.nextInt();
dr=dr-1;
System.out.println();
System.out.println(" Column   Number   Of   DOUBT  -");
System.out.println();
System.out.print(" ");
dc=sc.nextInt();
System.out.println();
System.out.println();	
dc=dc-1;
Arr2[dr][dc]="?";
}
for(i3=0;i3<r;i3++)
{
System.out.print(" ");
for(x3=0;x3<c;x3++)
{
System.out.print("|");
System.out.print(Arr2[i3][x3]);
}
System.out.println("|");
System.out.println();
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(Arr2[i][j].compareTo(" ")==0)
{
ji=ji+1;
}
}
}
if(ji==0)
break abc;
ji=0;
}
for(i4=0;i4<r;i4++)
{ 
for(j4=0;j4<c;j4++)
{
if(Arr2[i4][j4].compareTo("@")==0)
{
if(Arr[i4][j4]>=10)
{
s3=s3+25;
}
else
{
s3=s3-25;           
}
}
if(Arr2[i4][j4].compareTo("?")==0)
{
if(Arr[i4][j4]>=10)
{
s3=s3+10;
}
else
{
s3=s3-10;
}
}
}
}
System.out.println();
System.out.println();
System.out.println("                                               ========================================");
System.out.println("                                                   T O T A L   P O I N T S   =   " + s3);
System.out.println("                                               ========================================");
System.out.println();
System.out.println();
System.out.println();
}
}
}
