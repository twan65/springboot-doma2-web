package com.sample.common.validation.validator;

import com.sample.common.validation.DateFormatValid;
import org.thymeleaf.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 日付フォーマットのバリデータ
 */
public class DateFormatValidator implements ConstraintValidator<DateFormatValid, String> {

    @Override
    public void initialize(DateFormatValid constraintAnnotation) {}

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        // 未入力は未入力チェックのアノテーションを利用
        if(StringUtils.isEmpty(value)) {
            return true;
        }

        Pattern pattern = Pattern.compile("^(¥¥d{4})[年/]?(¥¥d{1,2})[月/]?(¥¥d{1,2})[日/]$");
        Matcher matcher = pattern.matcher(value);

        if(matcher.find()) {
            try {
                LocalDate.of(Integer.valueOf(matcher.group(1)), Integer.valueOf(matcher.group(2)), Integer.valueOf(matcher.group(3)));
            } catch (Exception ex) {
                return false;
            }
        } else {
            return false;
        }

        // 正常
        return true;
    }
}
