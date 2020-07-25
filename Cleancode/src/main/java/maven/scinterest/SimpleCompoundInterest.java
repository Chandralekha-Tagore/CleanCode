package maven.scinterest;
import java.util.*;

class SimpleCompoundInterest {
	SimpleInterest(double principleamount,double rate,int time)
	{
		double simpleinterest;
		simpleinterest=(principleamount * time * rate)/100;
                return simpleinterest;
	}
	CompoundInterest(double principleamount,double rate,int time)
	{
		double compoundinterest;
                compoundinterest=principleamount * Math.pow(1.0 + rate / 100.0 , time) - principleamount;
                return compoundinterest;    
	}

}
