# แอพ FarkyTalkTalk
    เป็นแอพเกี่ยวกับ ChatBot คล้ายคลึงกับ Simsimi โดยมีรายระเอียดดังนี้
    
      - มีการดึง API จาก developer.simsimi.com
      - มีการดึง Libary มาใช้งาน
          - compile 'com.android.support:design:25.1.1'
          - compile 'com.github.lguipeng:BubbleView:1.0.1'
          - compile 'com.google.code.gson:gson:2.8.0'
      - โดยในส่วน Layout มี 3 ส่วน
          - Activity Main หรือหน้าหลัก
          - messenger recv หรือ ส่วนการโต้ตอบของ Bot
          - messenger send หรือ ส่วนการโต้ตอบของ ผู้ใช้งาน 
      - โดยใน Javaclass จะมี
          - Chatmodel.java   เป็นรูปแบบโมเดลการ Chat
          - FarkyTalkTalkModel.java  เป็นรูปแบบ Model Bot
          - customAdapter.java  เป็นตัวควบคุม Adapter
          - MainActivity.java จะเป็นส่วนของการเชื่อมต่อ Api 
  ผู้จัดทำ 
        -  ปรเมศวร์, ทองแก้วเกิด รหัสนศ 5830213003
        
     
   #หมายเหตุ
        - Api มีอายุ 7 วัน , โดยได้สร้างวันที่ 15/12/60 และจะหมดอายุในวันที่ 21/12/60 หากหมดอายุ โปรแกรมจะไม่สามารถพูดคุยได้ 
        
        

รูปยืนยันว่าแอพนี้สามารถใช้งานได้จริง (เผื่อก่อน Api หมดอายุก่อน)
    
![01](https://user-images.githubusercontent.com/23073425/34078698-1bae038c-e352-11e7-807b-90420f728ff9.JPG)
![00](https://user-images.githubusercontent.com/23073425/34082855-e75eb06c-e398-11e7-8c4d-e5a7569ae2f4.JPG)

