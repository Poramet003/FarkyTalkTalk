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
        
        

    
    

