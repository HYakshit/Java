import java.text.DecimalFormat;

class Commission {
    float baseCommission, gst, pg, fulfillmentFee;

    Commission() {
        gst = 18;
        pg = 1.84f;
        baseCommission = 12;
        fulfillmentFee = 14;
    }

    //  for non unbundeling
    float calculate(float orderValue, float baseCommission) {
//        pg is calculated on CV
        float pgCharges = (pg * orderValue) / 100;
        float baseCharges = (baseCommission * orderValue) / 100;
        float gstCharges = (gst * baseCharges) / 100;
        System.out.println("Pg charges" + pgCharges);
        System.out.println("base charges" + baseCharges);
        System.out.println("gst charges" + gstCharges);
        return pgCharges + baseCharges + gstCharges;

    }

    float calculate(float orderValue, float baseCommission, float killometers, int cap) {
//        pg is calculated on CV
        float capCharges = (cap * orderValue) / 100;
        float fulfillmentCharges = killometers * fulfillmentFee;
        float pgCharges = (pg * orderValue) / 100;

        float baseCharges = (baseCommission * orderValue) / 100;
        float gstCharges = (gst * (baseCharges + fulfillmentCharges + pgCharges)) / 100;
        float totalCharges = fulfillmentCharges + baseCharges + pgCharges + gstCharges;
        System.out.println("cap charges" + capCharges);
        if (totalCharges > capCharges) {
            return capCharges;
        }
        System.out.println("fulfillment Charges" + fulfillmentCharges);
        System.out.println("Pg charges" + pgCharges);
        System.out.println("base charges" + baseCharges);
        System.out.println("gst charges" + gstCharges);
        return fulfillmentCharges + baseCharges + pgCharges + gstCharges;
    }

//    float efficiency(int dials,int connected,int talktimeInMins,int outOff){
//        DecimalFormat decimalFormat=new DecimalFormat("##.##");
//        int calls_grace_time=(connected*2)+ (dials-connected);
//        float result= ((float) (calls_grace_time + talktimeInMins) /outOff)*100;
//        return decimalFormat.format(result);
//    }
}

public class Commission_cal {
    public static void main(String[] args) {
        Commission obj = new Commission();
        float totalCommission = obj.calculate(100, 25);
        System.out.println("Total commission is " + totalCommission);
//        System.out.println(obj.efficiency(105,55,204,420));
    }
}
