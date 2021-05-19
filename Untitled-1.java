/ *
 * Để thay đổi tiêu đề giấy phép này, hãy chọn Tiêu đề giấy phép trong Thuộc tính dự án.
* Để thay đổi tệp mẫu này, hãy chọn Công cụ | Mẫu
 * và mở mẫu trong trình chỉnh sửa.
 * /
gói  Demo2 ;


nhập  java.util.ArrayList ;
nhập  javax.swing.JOptionPane ;

/ **
 *
* @author minhdq
 * /
public  cuối cùng  lớp  DN  mở rộng  javax.swing . JFrame {

    / **
     * Tạo hình thức DN mới
     * /
    ArrayList < SinhVien > listSV =  new  ArrayList <> ();

     DN công cộng () {
        initComponents ();
        setLocationRelativeTo ( null ); // show form ra between screen
        setResizable ( sai ); // ko cho thay đổi dạng kích thước
        tải dữ liệu();
        for ( SinhVien xxx : listSV) cbbSinhVien . addItem (xxx . getUserName ());

        
    }

    / **
     * Phương thức này được gọi từ bên trong hàm tạo để khởi tạo biểu mẫu.
     * CẢNH BÁO: KHÔNG sửa đổi mã này. Nội dung của phương pháp này luôn là
     * được tạo lại bởi Trình chỉnh sửa biểu mẫu.
     * /
    @SuppressWarnings ( "bỏ chọn " )
    // <editor-fold defaultstate = "secure" desc = "Generated Code"> // GEN-BEGIN: initComponents
    private  void  initComponents () {

        jPanel1 =  javax.swing mới  . JPanel ();
        tfPassWord =  javax.swing mới  . JPasswordField ();
        btn_DangNhap =  javax.swing mới  . JButton ();
        btn_LamMoi =  javax.swing mới  . JButton ();
        btn_SieuThoat =  new  javax.swing . JButton ();
        lbDangNhap =  javax.swing mới  . JLabel ();
        jLabel2 =  javax.swing mới  . JLabel ();
        jLabel3 =  javax.swing mới  . JLabel ();
        tfUserName =  javax.swing mới  . JTextField ();
        cbbSinhVien =  new  javax.swing.JComboBox <> ();
        btnShow =  javax.swing mới  . JButton ();
        btnThem =  javax.swing mới  . JButton ();
        lbShowPass =  javax.swing mới  . JLabel ();

        setDefaultCloseOperation ( javax.swing . WindowConstants . EXIT_ON_CLOSE );

        btn_DangNhap . setText ( " Đăng Nhập " );
        btn_DangNhap . addActionListener ( java.awt.event mới  . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                btn_DangNhapActionPerformed (evt);
            }
        });

        btn_LamMoi . setText ( " Làm mới " );
        btn_LamMoi . addActionListener ( java.awt.event mới  . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                btn_LamMoiActionPerformed (evt);
            }
        });

        btn_SieuThoat . setText ( " Siêu Quit " );
        btn_SieuThoat . addActionListener ( java.awt.event mới  . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                btn_SieuThoatActionPerformed (evt);
            }
        });

        lbDangNhap . setFont ( new  java.awt . Font ( " Lucida Grande " , 0 , 18 )); // NOI18N
        lbDangNhap . setForeground ( java.awt mới  . color ( 0 , 51 , 255 ));
        lbDangNhap . setText ( " Đăng Nhập " );
        lbDangNhap . setBorder ( javax.swing . BorderFactory . createLineBorder ( new  java.awt . color ( 0 , 0 , 0 )));

        jLabel2 . setText ( " Tên người dùng: " );

        jLabel3 . setText ( " Mật khẩu: " );

        btnShow . setText ( " Hiển thị " );
        btnShow . addActionListener ( java.awt.event mới  . ActionListener () {
            public  void  actionPerformed ( java.awt.event . ActionEvent  evt ) {
                btnShowActionPerformed (evt);
            }
        });

        btnThem . setText ( " Thêm " );

        javax.swing . GroupLayout jPanel1Layout =  new  javax.swing . GroupLayout (jPanel1);
        jPanel1 . setLayout (jPanel1Layout);
        jPanel1Layout . setHorizontalGroup (
            jPanel1Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup (jPanel1Layout . createSequentialGroup ()
                .addGroup (jPanel1Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                    .addGroup (jPanel1Layout . createSequentialGroup ()
                        .addGap ( 60 , 60 , 60 )
                        .addGroup (jPanel1Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                            .addComponent (jLabel3)
                            .addComponent (jLabel2))
                        .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . UNRELATED )
                        .addGroup (jPanel1Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING , false )
                            .addComponent (tfUserName)
                            .addComponent (tfPassWord, javax.swing . GroupLayout . DEFAULT_SIZE , 188 , Short . MAX_VALUE )))
                    .addGroup (jPanel1Layout . createSequentialGroup ()
                        .addGap ( 164 , 164 , 164 )
                        .addComponent (lbDangNhap))
                    .addGroup (jPanel1Layout . createSequentialGroup ()
                        .addGap ( 42 , 42 , 42 )
                        .addGroup (jPanel1Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
                            .addGroup (jPanel1Layout . createSequentialGroup ()
                                .addComponent (cbbSinhVien, javax.swing . GroupLayout . PREFERRED_SIZE , 134 , javax.swing . GroupLayout . PREFERRED_SIZE )
                                .addGap ( 26 , 26 , 26 )
                                .addComponent (btnShow)
                                .addGap ( 67 , 67 , 67 )
                                .addComponent (lbShowPass, javax.swing . GroupLayout . PREFERRED_SIZE , 90 , javax.swing . GroupLayout . PREFERRED_SIZE ))
                            .addGroup (jPanel1Layout . createSequentialGroup ()
                                .addComponent (btn_DangNhap)
                                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . LIÊN QUAN )
                                .addComponent (btn_LamMoi)
                                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . LIÊN QUAN )
                                .addComponent (btn_SieuThoat)
                                .addPreferredGap ( javax.swing . LayoutStyle . ComponentPlacement . LIÊN QUAN )
                                .addComponent (btnThem)))))
                .addContainerGap ( 88 , Ngắn . MAX_VALUE ))
        );
        jPanel1Layout . setVerticalGroup (
            jPanel1Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup (jPanel1Layout . createSequentialGroup ()
                .addGap ( 23 , 23 , 23 )
                .addComponent (lbDangNhap)
                .addGap ( 32 , 32 , 32 )
                .addGroup (jPanel1Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . trailing )
                    .addComponent (jLabel2)
                    .addComponent (tfUserName, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ))
                .addGap ( 11 , 11 , 11 )
                .addGroup (jPanel1Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                    .addComponent (jLabel3)
                    .addComponent (tfPassWord, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE ))
                .addGap ( 15 , 15 , 15 )
                .addGroup (jPanel1Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                    .addComponent (btn_DangNhap)
                    .addComponent (btn_SieuThoat)
                    .addComponent (btn_LamMoi)
                    .addComponent (btnThem))
                .addGap ( 33 , 33 , 33 )
                .addGroup (jPanel1Layout . createParallelGroup ( javax.swing . GroupLayout . Alignment . BASELINE )
                    .addComponent (cbbSinhVien, javax.swing . GroupLayout . PREFERRED_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . PREFERRED_SIZE )
                    .addComponent (btnShow)
                    .addComponent (lbShowPass))
                .addContainerGap ( 227 , Ngắn gọn . MAX_VALUE ))
        );

        javax.swing . Bố cục GroupLayout =  new  javax.swing . GroupLayout (getContentPane ());
        getContentPane () . setLayout (bố cục);
        bố cục . setHorizontalGroup (
            bố cục . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addGroup (layout . createSequentialGroup ()
                .addContainerGap ()
                .addComponent (jPanel1, javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
                .addContainerGap ())
        );
        bố cục . setVerticalGroup (
            bố cục . createParallelGroup ( javax.swing . GroupLayout . Alignment . LEADING )
            .addComponent (jPanel1, javax.swing . GroupLayout . DEFAULT_SIZE , javax.swing . GroupLayout . DEFAULT_SIZE , Short . MAX_VALUE )
        );

        đóng gói();
    } // </editor-fold> // GEN-END: initComponents
    
    public  void  showPass () {
        int viTri = cbbSinhVien . getSelectedIndex ();
        Chuỗi acc = listSV . lấy (viTri) . lấy mật khẩu();
        lbShowPass . setText (tài khoản);
    }
    public  void  loadData () {
        danh sáchSV . add ( new  SinhVien ( " minh " , " 123 " , " IT16303 " ));
        danh sáchSV . add ( new  SinhVien ( " 111 " , " 123 " , " IT16303 " ));
        danh sáchSV . add ( new  SinhVien ( " 222 " , " 123 " , " IT16303 " ));
        danh sáchSV . add ( new  SinhVien ( " 333 " , " 123 " , " IT16303 " ));
        //
    }

    public  void  clearForm () {
        tfUserName . setText ( " " );
        tfPassWord . setText ( " " );
    }

    public  void  loginForm () {
        thử {
            for ( SinhVien xxx : listSV) {
                if (tfUserName . getText () . equalsIgnoreCase (xxx . getUserName ())
                        && tfPassWord . getText () . equalsIgnoreCase (xxx . getPassWord ())) {
                    JOptionPane . showMessageDialog (rootPane, " Đăng nhập vào thành con nhà bà công " );
                    trở lại ;
                }
            }
            if (tfUserName . getText () . equals ( " " )) {
                JOptionPane . showMessageDialog ( this , " Người dùng không được để trống! " );
            } else  if (tfPassWord . getText () . equals ( " " )) {
                JOptionPane . showMessageDialog ( this , " Pass không được để trống! " );
            } khác {
                JOptionPane . showMessageDialog (rootPane, " Thất con bại " );
            }
        } catch ( Ngoại lệ e) {
            JOptionPane . showMessageDialog (rootPane, " Đăng nhập lỗi " );
        }
    }
    private  void  btn_SieuThoatActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_btn_SieuThoatActionPerformed
        // VIỆC CẦN LÀM thêm mã xử lý của bạn tại đây:
        Hệ thống . thoát ra ( 0 );
    } // GEN-LAST: event_btn_SieuThoatActionPerformed

    private  void  btn_LamMoiActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_btn_LamMoiActionPerformed
        // VIỆC CẦN LÀM thêm mã xử lý của bạn tại đây:
        hình thức rõ ràng();
    } // GEN-LAST: event_btn_LamMoiActionPerformed

    private  void  btn_DangNhapActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_btn_DangNhapActionPerformed
        // VIỆC CẦN LÀM thêm mã xử lý của bạn tại đây:
        mẫu đăng nhập();
        hình thức rõ ràng();
    } // GEN-LAST: event_btn_DangNhapActionPerformed

    private  void  btnShowActionPerformed ( java.awt.event . ActionEvent  evt ) { // GEN-FIRST: event_btnShowActionPerformed
        // VIỆC CẦN LÀM thêm mã xử lý của bạn tại đây:
        showPass ();
    } // GEN-LAST: event_btnShowActionPerformed

    / **
     * @param cung cấp các đối số dòng lệnh
     * /
    public  static  void  main ( String  args []) {
        / * Đặt giao diện Nimbus * /
        // <editor-fold defaultstate = "sập" desc = "Mã cài đặt giao diện (tùy chọn)">
        / * Nếu Nimbus (được giới thiệu trong Java SE 6) không khả dụng, hãy giữ nguyên giao diện mặc định.
         * Để biết chi tiết, hãy xem http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         * /
        thử {
            for ( javax.swing . UIManager . Thông tin LookAndFeelInfo :  javax.swing . UIManager . getInstalledLookAndFeels ()) {
                if ( " Nimbus " . bằng (thông tin . getName ())) {
                    javax.swing . UIManager . setLookAndFeel (thông tin . getClassName ());
                    phá vỡ ;
                }
            }
        } catch ( ClassNotFoundException ex) {
            java.util.logging . Người ghi sổ . getLogger ( DN . class . getName ()) . log ( java.util.logging . Level . SEVERE , null , ex);
        } catch ( InstantiationException ex) {
            java.util.logging . Người ghi sổ . getLogger ( DN . class . getName ()) . log ( java.util.logging . Level . SEVERE , null , ex);
        } catch ( IllegalAccessException ex) {
            java.util.logging . Người ghi sổ . getLogger ( DN . class . getName ()) . log ( java.util.logging . Level . SEVERE , null , ex);
        } catch ( javax.swing . UnsupportedLookAndFeelException ex) {
            java.util.logging . Người ghi sổ . getLogger ( DN . class . getName ()) . log ( java.util.logging . Level . SEVERE , null , ex);
        }
        // </editor-fold>

        / * Tạo và hiển thị biểu mẫu * /
        java.awt . EventQueue . invokeLater ( new  Runnable () {
            public  void  run () {
                 DN mới () . setVible ( đúng );
            }
        });
    }

    // Khai báo biến - không sửa đổi // GEN-BEGIN: biến
     javax.swing riêng tư . JButton btnShow;
     javax.swing riêng tư . JButton btnThem;
     javax.swing riêng tư . JButton btn_DangNhap;
     javax.swing riêng tư . JButton btn_LamMoi;
     javax.swing riêng tư . JButton btn_SieuThoat;
    private  javax.swing.JComboBox < String > cbbSinhVien;
     javax.swing riêng tư . JLabel jLabel2;
     javax.swing riêng tư . JLabel jLabel3;
     javax.swing riêng tư . JPanel jPanel1;
     javax.swing riêng tư . JLabel lbDangNhap;
     javax.swing riêng tư . JLabel lbShowPass;
     javax.swing riêng tư . JPasswordField tfPassWord;
     javax.swing riêng tư . JTextField tfUserName;
    // Khai báo biến kết thúc // GEN-END: biến
}
