package labset_2;

public interface student_op {
	final float default_fees=500;
	final float mca_fees=1000;
	final float mba_fees=2000;
	final float mcom_fees=3000;
	public float calculate_fees(String branch);
}
