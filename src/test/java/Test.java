import com.homework.bean.Employee;
import com.homework.service.EmployeeFinder;
import com.homework.service.EmployeeRepository;
import com.homework.utils.FileUtil;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> strings = FileUtil.readFile("D:\\Test\\test.txt");
        System.err.println(strings);

        List<Employee> employeeList = EmployeeRepository.getInstance().buildMultiEmployee(strings);

        EmployeeFinder.getInstance().getBirthdayOnCurrentDayEmployees(employeeList);
    }
}
