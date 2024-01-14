package com.example.springbootcoreguide.DTO;
//dto란 다른 레이어 간 데이터 교환
public class MemberDTO {

    private String name;
    private String email;
    private String organization;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return name;
    }

    public void setEmail(String email) {
        this.name = email;
    }

    public String getOrganization() {
        return name;
    }

    public void setOrganization(String organization) {
        this.name = organization;
    }

    @Override
    public String toString() { //객체의 각 속성값이 포함된 형태로 나타남
        return "MemberDTO{" +
                "name = '" + name + '\'' + //작은 따옴표를 사용하기 위해 백슬래시 \ 사용
                ", email = '" + email + '\'' +
                ", organizationn = '" + organization + '\'' +
                '}';
    }

}
