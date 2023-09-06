package org.koreait.exam;

import org.koreait.constants.Role;

public class Ex01 {
    public static void main(String[] args) {
        Role role1 = Role.ADMIN;
        Role role2 = Role.USER;

        System.out.printf("ordinal : %d, name: %s%n", role1.ordinal(), role1.name());
        System.out.printf("ordinal : %d, name: %s%n", role2.ordinal(), role2.name());

    }
}
