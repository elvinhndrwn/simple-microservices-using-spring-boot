package com.learning.user.VO;

import com.learning.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateResponseVO {
    private User user;
    private Department department;
}
