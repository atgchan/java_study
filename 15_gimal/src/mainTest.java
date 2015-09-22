import java.io.IOException;

import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import trainStation.trainStation;

public class mainTest {

	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		trainStation ts = new trainStation();
		ts.welcomeCustomers();
		ts.startTicketing();
	}

}
