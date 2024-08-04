# 苍穹外卖项目

苍穹外卖是专门为餐饮企业（餐厅、饭店）定制的一款软件产品，包括系统管理后台和小程序端应用两部分。

## 功能介绍

**系统管理后台**主要提供给餐饮企业内部员工使用，可以对餐厅的分类、菜品、套餐、订单、员工等进行管理维护，对餐厅的各类数据进行统计，同时也可进行来单语音播报功能。

**小程序端**主要提供给消费者使用，可以在线浏览菜品、添加购物车、下单、支付、催单等。

## 快速搭建项目

### 配置OSS服务

请注意，上传的图片需要使用自己的OSS服务。在`application-dev.yml`文件中，将以下几个值替换为自己的实际值：

```yml
sky:
  alioss:
    access-key-id: "YOUR_ACCESS_KEY_ID" # 替换为实际的AccessKeyId
    access-key-secret: "YOUR_ACCESS_KEY_SECRET" # 替换为实际的AccessKeySecret
  wechat:
    appid: YOUR_APPID # 替换为实际的APPID
    secret: YOUR_SECRET # 替换为实际的SECRET
    notifyUrl: https://275c7d4b.r23.cpolar.top/notify/paySuccess
    refundNotifyUrl: https://275c7d4b.r23.cpolar.top/notify/refundSuccess
```

`application-dev.yml`文件的路径为：`sky-server/src/main/resources/application-dev.yml`

以上就是苍穹外卖项目的简介和快速搭建指南，欢迎使用和反馈。
