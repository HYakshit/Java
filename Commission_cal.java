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
        this.baseCommission = baseCommission;
        float pgCharges = (pg / orderValue) * 100;
        float baseCharges = (baseCommission / orderValue) * 100;
        float gstCharges = (gst * baseCharges) / 100;
        return pgCharges + baseCharges + gstCharges;

    }

    float calculate(float orderValue, float baseCommission, float killometers, int cap) {
        float capCharges = (cap * orderValue) / 100;
        float fulfillmentCharges = killometers * fulfillmentFee;
        float pgCharges = (pg * orderValue) / 100;
        float baseCharges = (baseCommission * orderValue) / 100;
        float gstCharges = (gst * (baseCharges + fulfillmentCharges)) / 100;
        float totalCharges = fulfillmentCharges + baseCharges + pgCharges;
        if (totalCharges > capCharges) {
            return capCharges;
        }
        return fulfillmentCharges + baseCharges + pgCharges + gstCharges;
    }
}

public class Commission_cal {
    public static void main(String[] args) {
        Commission obj = new Commission();
        float totalCommission = obj.calculate(100, 25);
        System.out.println("Total commission is " + totalCommission);
    }
}
