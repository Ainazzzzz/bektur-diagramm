package rskhr.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public enum Department {
    CALCULATIONS_AND_TRANSFERS("Отдел расчетов и переводов"),
    CREDIT("Отдел кредитования"),
    ECONOMIC("Экономический отдел"),
    LEGAL("Юридический отдел"),
    SOFTWARE_DEVELOPMENT("Отдел программного обеспечения"),
    ACCOUNTING_AND_REPORTING("Отдел бухгалтерского учета и отчетности"),
    HUMAN_RESOURCES("Отдел кадров");

    private final String translation;

    Department(String translation){
        this.translation=translation;
    }

    public List<String> getAllDepartments(){
        return Arrays.stream(Department.values()).map(Department::getTranslation).toList();
    }

}
