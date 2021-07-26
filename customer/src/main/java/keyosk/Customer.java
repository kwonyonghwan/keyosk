package keyosk;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Customer_table")
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long orderId;
    private Long menuId;
    private String orderStatus;
    private Integer rejectCode;
    private String rejectDetail;
    private Integer menuCount;
    private Integer totalPrice;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public Integer getRejectCode() {
        return rejectCode;
    }

    public void setRejectCode(Integer rejectCode) {
        this.rejectCode = rejectCode;
    }
    public String getRejectDetail() {
        return rejectDetail;
    }

    public void setRejectDetail(String rejectDetail) {
        this.rejectDetail = rejectDetail;
    }
    public Integer getMenuCount() {
        return menuCount;
    }

    public void setMenuCount(Integer menuCount) {
        this.menuCount = menuCount;
    }
    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
    @Override
	public String toString() {
		return "Customer [orderId=" + orderId + ", menuId=" + menuId + ", orderStatus=" + orderStatus + ", rejectCode="
				+ rejectCode + ", rejectDetail=" + rejectDetail + ", menuCount=" + menuCount + ", totalPrice="
				+ totalPrice + "]";
	}



}
