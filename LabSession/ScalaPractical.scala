

//Question01
def area_of_disk(r: Double):Double=math.Pi*r*r;
//Question02
def convertTemperature(c:Double):Double=c*1.8000+32.00;
//Question03
def volume_of_sphere(r: Double):Double=(4*math.Pi*r*r*r)/3;
//Question04
def calculate_dis():Double=24.95*0.4;
def calculate_cost(x: Int):Double={
    if(x > 50){
        24.95-calculate_dis()+3+(x-50)*0.75;
    }
    else{
        24.95-calculate_dis()+3;
    }
}
//question05
def  easyplace(x: Int):Double=8*x;
def tempo(y: Int):Double=7*y;




