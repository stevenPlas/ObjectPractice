package math1;

/**
 *The math class takes two variables, and either adds, subtracts, multiplies
 * or divides two variables.
 * @author Steven
 */
public class Math {
    //fields
    double math1, math2;
    
    //constructors
    public Math(double math1, double math2){
        this.math1 = math1;
        this.math2 = math2;
    }
    //accesors
    public double getMath1(){return this.math1;}
    public double getMath2(){return this.math2;}
    
    
    public double addition(){//addition method
        return this.math1 + this.math2;
        
    }
    
    public double subtraction(){//subtraction method
        return this.math1 - this.math2;
    }

    public double multi(){//multiplacation method
        return this.math1 * this.math2;
    }
    
    public double division(){//division method
        return this.math1 / this.math2;
    }
    
    
}
