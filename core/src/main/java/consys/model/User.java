package consys.model;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbggenerated Mon Apr 11 21:44:59 CST 2016
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbggenerated Mon Apr 11 21:44:59 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.code
     *
     * @mbggenerated Mon Apr 11 21:44:59 CST 2016
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.update_user
     *
     * @mbggenerated Mon Apr 11 21:44:59 CST 2016
     */
    private String updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.update_date
     *
     * @mbggenerated Mon Apr 11 21:44:59 CST 2016
     */
    private Date updateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbggenerated Mon Apr 11 21:44:59 CST 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param userId the value for user.user_id
     *
     * @mbggenerated Mon Apr 11 21:44:59 CST 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbggenerated Mon Apr 11 21:44:59 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbggenerated Mon Apr 11 21:44:59 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.code
     *
     * @return the value of user.code
     *
     * @mbggenerated Mon Apr 11 21:44:59 CST 2016
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.code
     *
     * @param code the value for user.code
     *
     * @mbggenerated Mon Apr 11 21:44:59 CST 2016
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.update_user
     *
     * @return the value of user.update_user
     *
     * @mbggenerated Mon Apr 11 21:44:59 CST 2016
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.update_user
     *
     * @param updateUser the value for user.update_user
     *
     * @mbggenerated Mon Apr 11 21:44:59 CST 2016
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.update_date
     *
     * @return the value of user.update_date
     *
     * @mbggenerated Mon Apr 11 21:44:59 CST 2016
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.update_date
     *
     * @param updateDate the value for user.update_date
     *
     * @mbggenerated Mon Apr 11 21:44:59 CST 2016
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}