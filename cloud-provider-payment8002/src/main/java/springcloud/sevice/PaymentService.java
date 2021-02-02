package springcloud.sevice;

import com.hyt.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author huyouting
 * @Date 2021/1/21 14:04
 * @Description:
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
