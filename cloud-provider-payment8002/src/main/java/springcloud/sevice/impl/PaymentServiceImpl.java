package springcloud.sevice.impl;

import com.hyt.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcloud.dao.PaymentDao;
import springcloud.sevice.PaymentService;

import javax.annotation.Resource;

/**
 * @Author huyouting
 * @Date 2021/1/21 14:05
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
