//Question 01

def oparations01()= {
    var k,i,j = 2;
    var m,n =5;
    var f=12.0f;
    var g=4.0f;
    var c='X';
    println(k+12*m);
    println(m/j);
    println(n%j);
    println(m/j*j);
    println(f+10*5+g);
    i+=1;
    println(i*n);
}

//Question 02
def oparations02()={
    var a=2
    var b=3
    var c=4
    var d=5
    var k=4.3f
    var g=0.0f
    //a
    b -= 1
    println(b*a+c*d)
    d -=1;
    //b
    println(a)
    a+=1
    //c
    println(-2*(g-k)+c)
    //d
    println(c);
    c+=1
    //e
    c+=1
    var result = c*a
    a+=1
    println(result);
}
    //Question03
    def normalWH(NH: Int):Double={
        NH * 250;
    }
    def OTH(OT: Int):Double={
        OT*85;
    }
    def tax(salary: Double):Double={
        salary*0.12;
    }
    def salaryperweek(Wh: Int,Ot: Int):Double={
        val workingHoure=normalWH(Wh);
        val OT=OTH(Ot);
        val netsalary=workingHoure+OT;
        val tax=netsalary*0.12;
        netsalary - tax;


    }

    //Question 04
    def attendents(tp:Double)={
        120+(15-tp)/5*20;
    }

    def income(tp:Double) ={
        tp*attendents(tp);
    }

    def cost(tp:Double)={
        3*attendents(tp)+500;
    }

    def profit(tp:Double)={
        income(tp)-cost(tp);
    }