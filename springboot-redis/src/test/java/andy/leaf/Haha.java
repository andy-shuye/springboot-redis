package andy.leaf;

import andy.leaf.pojo.Address;

import java.io.Serializable;
import java.util.List;

/**
 * 描述:test
 *
 * @author 叶落知秋
 * @create 2019-06-17 23:25
 */
public class Haha implements Serializable {
    private String name;
    private String age;
    private List<Address> addresses;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Haha{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
