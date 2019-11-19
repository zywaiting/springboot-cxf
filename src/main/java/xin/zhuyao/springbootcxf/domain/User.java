package xin.zhuyao.springbootcxf.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

/**
 * @ClassName User
 * @Author zy
 * @Date 2019/11/19 16:06
 * @Description User
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User implements Serializable {

    Long id;

    String name;

    String phone;

}
