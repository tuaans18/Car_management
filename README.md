**HỌC VIỆN CÔNG NGHỆ BƯU CHÍNH VIỄN THÔN**G ![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.001.png)![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.002.jpeg)**KHOA CÔNG NGHỆ THÔNG TIN** 

-----🙞🙞🙞🙞🙞-----

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.003.png)

**Bài Tập Lớn** 

**Phân tích và thiết kế hệ thống thông tin** 

***ĐỀ TÀI*** 

**Hệ thống quản lý gara ô tô** 

**Nhóm học phần: 03  Nhóm BTL: 18 Sinh viên:** MAI ĐẠI LONG – MSV B19DCCN392 

**NGUYỄN ĐỨC TUẤN - MSV B19DCAT167** LÊ TRUNG VIỆT – MSV B19DCCN712 

**Modul quản lí thông tin xe** 

**Modul đặt lịch sửa xe  Modul thanh toán và trả xe** 

**Báo cáo tổng hợp** 

1. **Biểu đồ UC và mô tả** 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.004.jpeg)

**Quản lí thông tin xe của khách** 

Xóa xe: Use case này cho phép nhân viên quản lý xóa thông tin xe của khách  

Sửa xe: Use case này cho phép nhân viên quản lý sửa thông tin xe của khách 

Thêm xe: Use case này cho phép nhân viên quản lý thêm thông tin xe mới của khách 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.005.png)

**Khách đặt lịch sửa xe** 

Khách hàng đặt lịch : Use case này cho phép khách hàng đặt lịch đến sửa xe 

Tìm slot trống: Use case này cho phép khách hàng tìm slot còn trống theo ngày Đăng kí xe sửa: Use case này cho phép khách hàng đăng kí những xe cần sửa Thêm xe mới: Use case này cho phép khách hàng thêm thông tin xe mới muốn sửa 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.006.jpeg)

**Khách thanh toán sau khi nhận xe** 

Tìm kiếm mã hóa đơn:Use case này cho phép nhân viên thu ngân tìm kiếm theo mã hóa đơn khách hàng đưa 

Xác nhân thanh toán: Use case này cho phép nhân viên thu ngân xác nhận hóa đơn với khách hàng 

Chỉnh sửa hóa đơn: Use case này cho phép nhân viên thu ngân thêm bớt dịch vụ/phụ tùng 

2. **Kịch bản chuẩn và ngoại lệ**  

**Khách đặt lịch sửa xe** 

<table><tr><th colspan="1">Scenario </th><th colspan="8">Đặt lịch sửa xe </th></tr>
<tr><td colspan="1">Actor </td><td colspan="8">Khách hàng </td></tr>
<tr><td colspan="1">Pre-condition </td><td colspan="8">Khách hàng có tài khoản trong hệ thống </td></tr>
<tr><td colspan="1">Post-condition </td><td colspan="8">Khách hàng đặt được lịch sửa xe </td></tr>
<tr><td colspan="1" rowspan="3" valign="top">Main event </td><td colspan="8"><p>1. Khách hàng A nhập username: “oto”, password: “****” để đăng nhập vào hệ thống </p><p>2. GD chính của khách hàng A hiện ra có: menu chọn đặt lịch sửa xe </p><p>3. Khách hàng A chọn đặt lịch sửa xe </p><p>4. GD đăng kí xe sửa hiện ra có bảng danh sách các xe đã sửa trước đó bao gồm thông tin xe: Biển số, Hãng xe, Loại xe </p></td></tr>
<tr><td colspan="1" rowspan="2" valign="top"></td><td colspan="3">Chọn xe </td><td colspan="1">Biển số </td><td colspan="1">Hãng xe </td><td colspan="1">Loại xe </td><td colspan="1" rowspan="1" valign="top"></td></tr>
<tr><td colspan="1"></td><td colspan="1"></td><td colspan="1"></td><td colspan="1">99A-8888 </td><td colspan="1">Kia </td><td colspan="1" valign="top">KIA K3 1.6 Premium</td></tr>
</table>


<table><tr><th colspan="1" rowspan="6"></th><th colspan="1" rowspan="6"></th><th colspan="1"></th></tr>
<tr><td colspan="2" valign="top">9:00 </td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.008.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="1" rowspan="5"></td></tr>
<tr><td colspan="2" valign="top">10:00 </td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.008.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.008.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td></tr>
<tr><td colspan="2" valign="top">11:00 </td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.008.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.008.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td></tr>
<tr><td colspan="2" valign="top">13:00 </td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.008.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.008.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.008.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.008.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.008.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td></tr>
<tr><td colspan="2" valign="top">14:00 </td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.008.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.008.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td></tr>
</table>


<table><tr><th colspan="1" rowspan="10"></th><th colspan="5" valign="top">15:00 </th><th colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</th><th colspan="2" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</th><th colspan="2" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.008.png)</th><th colspan="2" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</th><th colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.008.png)</th><th colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</th></tr>
<tr><td colspan="5" valign="top">16:00 </td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="2" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.008.png)</td><td colspan="2" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="2" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td></tr>
<tr><td colspan="5" valign="top">17:00 </td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="2" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="2" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="2" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td><td colspan="1" valign="top">![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.007.png)</td></tr>
<tr><td colspan="2" valign="bottom"><p>15. Khách hàng A chọn slot A lúc 9:00 và click tiếp tục </p><p>16. GD xác nhận lịch hiện ra có: 1 bảng thông tin xe có: biển số, hãng xe, loại xe, 1 bảng lịch sửa: Slot, ngày, giờ, 1 nút xác nhận , 1 nút quay lại </p><p><b>Thông tin xe</b> </p></td></tr>
<tr><td colspan="1" rowspan="6" valign="top"></td><td colspan="6">Biển số  </td><td colspan="2">Hãng xe </td><td colspan="6">Loại xe </td></tr>
<tr><td colspan="6">99A-7777 </td><td colspan="2">Toyota </td><td colspan="6">Toyota Vios 1.5E MT</td></tr>
<tr><td colspan="2"><b>Lịch sửa xe</b> </td></tr>
<tr><td colspan="6">Slot </td><td colspan="4">Ngày </td><td colspan="4">Giờ </td></tr>
<tr><td colspan="6" valign="top">A </td><td colspan="4" valign="top">2022-09-01 </td><td colspan="4" valign="top">9:00 </td></tr>
<tr><td colspan="2"></td><td colspan="1"></td></tr>
<tr><td colspan="1" valign="top">Exception </td><td colspan="16" valign="top"><p>18\. Trong lúc Khách hàng A đặt lịch thì đã có người khác đặt thành công, trùng với slot và lịch KH A đã chọn </p><p>18.1. Khách hàng click vào OK của thông báo </p><p>18.2. Hệ thống quay lại giao diện đặt lịch </p><p>18.1. Khách hàng A chọn lại giờ 11:00 và click xác nhận </p><p>18.2. Hệ thống hiện kết quả như bước 18 </p></td></tr>
</table>

**Quản lí thông tin xe của khách – sửa thông tin xe của khách** 

|Scenario |Sửa thông tin xe của khách |
| - | - |
|Actor |Nhân viên quản lí, Khách hàng |
|Pre-condition |Nhân viên quản lí đăng nhập thành công |
|Post-condition |Thông tin xe của khách sửa thành công |
|Main events |<p>1. Quản lí A chọn chức năng Quản lí xe </p><p>2. Giao diện quản lí xe xuất hiện với 3 tùy chọn: Thêm xe, Sửa xe, Xóa xe </p><p>3. Người quản lí A nhấp vào tùy chọn sửa xe trong menu quản lí xe. Quản lí A muốn sửa xe cho khách hàng B đang yêu cầu. </p>|



<table><tr><th colspan="1" rowspan="6"></th><th colspan="4"><p>4. Giao diện người tìm kiếm xe xuất hiện với: văn bản đầu vào cho từ khóa (loại xe), nút tìm kiếm, 1 bảng các xe gồm thông tin: Biển số, Hãng xe, Loại xe </p><p>5. Người quản lí A nhập từ khóa “Morning”, sau đó nhấp tìm kiếm </p><p>6. Danh sách tất cả các xe có tên loại xe chứa từ khóa đã nhập sẽ xuất hiện như sau: </p></th></tr>
<tr><td colspan="1">Biển số </td><td colspan="1">Hãng xe </td><td colspan="1">Loại xe </td></tr>
<tr><td colspan="1">99A-8888 </td><td colspan="1">Kia </td><td colspan="1" valign="top">KIA Morning X-Line</td></tr>
<tr><td colspan="1">99A-9999 </td><td colspan="1">Kia </td><td colspan="1" valign="top">KIA Morning AT</td></tr>
<tr><td colspan="1" valign="top">99A-1111 </td><td colspan="1" valign="top">Kia  </td><td colspan="1">KIA Morning AT LUXURY</td></tr>
<tr><td colspan="4" valign="top"><p>7. Người quản lí A bấm vào dòng đầu tiên tương ứng xe  </p><p>KIA Morning X-Line, biến số 99A-8888, theo yêu cầu Khách hàng B </p><p>8. Giao diện chỉnh sửa xe xuất hiện với các thuộc tính và giá trị của chúng đối với xe đã chọn: </p><p>Id: 1(chỉ xem) | Biến số: 99A-8888 | Hãng xe: Kia | Loại xe: KIA Morning X-Line </p><p>- Nút save </p><p>- Nút reset </p><p>9. Người quản lí A chỉnh sửa loại xe theo yêu cầu của Khách Hàng B thành: KIA Morning X-Line 1.0, và nhấp nút lưu save</p><p>10. Một thông báo thành công sẽ xuất hiện và sau đó hệ thống quay lại giao diện chính của quản lí </p></td></tr>
<tr><td colspan="1" valign="top">Exception </td><td colspan="4"><p>6\. Không có xe nào được tìm thấy </p><p>6.1. Quản lí A click vào OK của thông báo </p><p>6.2. Hệ thống quay lại giao diện tìm xe </p><p>6.3. Quản lí A nhập tên = xx click tìm </p><p>6.4. Hệ thống hiện kq như bước 6 </p></td></tr>
</table>

**Khách thanh toán sau khi nhận xe** 



|Scenario |Khách thanh toán sau khi nhận xe |
| - | - |
|Actor |NV thu ngân, Khách hàng |
|Pre-condition |NV thu ngân đã đăng nhập thành công |
|Post-condition |Hệ thống in hóa đơn và cho NV và KH kí |
|Main events |<p>1. NV thu ngân A chọn chức năng thanh toán để thanh toán cho khách hàng B đem  hóa đơn đến thanh toán </p><p>2. Giao diện tìm hóa đơn hiện lên, có ô nhập, nút tìm kiếm </p>|



<table><tr><th colspan="1" rowspan="16"></th><th colspan="12"><p>3. NV A nhập mã hóa đơn trên tờ hóa đơn tạm do KH đem tới và bấm tìm kiếm </p><p>4. Hệ thống hiện ra hóa đơn chi tiết cho NV A hiện lên gồm có thông tin KH B gồm: tên, địa chỉ, số điện thoại, email và thông tin xe gồm: biển số, hãng xe, loại xe và bảng danh sách các dịch vụ/linh kiện mà KH B đã dùng/thay thế gồm có: TT, tên, đơn giá, số lượng, thành tiền </p><p>`                              `<b>HÓA ĐƠN BÁN HÀNG</b> </p><p><b>Tên Khách hàng:</b> Nguyễn Đức B </p><p><b>Địa chỉ:</b> Bắc Ninh </p><p><b>Số điện thoại</b>: 0918273645 </p></th></tr>
<tr><td colspan="5" valign="top">Biển số </td><td colspan="3" valign="top">Hãng xe </td><td colspan="3" valign="top">Loại xe </td></tr>
<tr><td colspan="5" valign="top">99A-8888 </td><td colspan="3" valign="top">Kia </td><td colspan="3" valign="top">KIA Morning X-Line</td></tr>
<tr><td colspan="5" valign="top">99B-9999 </td><td colspan="3" valign="top">Kia </td><td colspan="3" valign="top">KIA Morning AT</td></tr>
<tr><td colspan="1" valign="top"><b>Dịch vụ trong hóa đơn</b> </td></tr>
<tr><td colspan="3">TT </td><td colspan="3">Tên  </td><td colspan="1">Đơn giá </td><td colspan="2">Số lượng </td><td colspan="2">Thành tiền </td></tr>
<tr><td colspan="3">1 </td><td colspan="3">Công thay thế vật tư </td><td colspan="1">1\.000.000 </td><td colspan="2">1 </td><td colspan="2">1\.000.000 </td></tr>
<tr><td colspan="3">2 </td><td colspan="3">Làm mát turbo </td><td colspan="1">200\.000 </td><td colspan="2">1 </td><td colspan="2">200\.000 </td></tr>
<tr><td colspan="3">3 </td><td colspan="3">Lọc xăng </td><td colspan="1">2\.500.000 </td><td colspan="2">1 </td><td colspan="2">2\.500.000 </td></tr>
<tr><td colspan="9">Tổng tiền </td><td colspan="2">3\.700.000 </td></tr>
<tr><td colspan="12"><b>Phụ tùng trong hóa đơn</b> </td></tr>
<tr><td colspan="2">1 </td><td colspan="4">Giảm xóc trước </td><td colspan="1">100\.000 </td><td colspan="2">1 </td><td colspan="2">100\.000 </td></tr>
<tr><td colspan="2" valign="top">2 </td><td colspan="4">Cao xu đệm đầu giảm xóc trước </td><td colspan="1" valign="top">100\.000 </td><td colspan="2" valign="top">2 </td><td colspan="2" valign="top">200\.000 </td></tr>
<tr><td colspan="2">3 </td><td colspan="4">Bọc ghế </td><td colspan="1">100\.000 </td><td colspan="2">1 </td><td colspan="2">100\.000 </td></tr>
<tr><td colspan="1" rowspan="2" valign="top"></td><td colspan="9">Tổng tiền </td><td colspan="3">300\.000 </td></tr>
<tr><td colspan="3"><p>`                                           `Tổng tiền hóa đơn: 4.000.000đ </p><p>5. NV A chọn chức năng xác nhận </p><p>6. Giao diện xác nhận hiện ra hóa đơn chi tiết dịch vụ/phụ tùng khách hàng B đã dùng </p><p>7. NV A đọc lại các thông tin của hóa đơn và yêu cầu KH xác nhận </p><p>8. KH B đồng ý và xác nhận </p><p>9. NV A nhận 4.000.000 của KH B và click nút đã thanh toán </p><p>10. Hệ thống thông báo thành công đã lưu vào cơ sở dữ liệu và in ra cho NV A và </p><p>KH B kí </p></td></tr>
<tr><td colspan="1" valign="top">Exception </td><td colspan="12"><p>8\. Hệ thống hiện ra dịch vụ/phụ tùng khách hàng B đã sử dụng </p><p>chưa chính xác với    thực tế </p><p>8\.1 KH B yêu cầu NV A bớt phụ tùng Lọc xăng  và thêm dịch vụ Vệ </p></td></tr>
</table>



||<p>sinh xe </p><p>8\.2 NV A thêm tên của dịch vụ Vệ Sinh xe vào ô trống theo yêu cầu của KH B và    click nút thêm và với dòng đã chọn chứa phụ tùng Lọc xăng và click nút xóa </p><p>Kết quả hóa đơn hiện ra tương tự bước 8 của kịch bản chính </p>|
| :- | - |

**III.Trích lớp thực thể liên quan**  

1. **Mô tả hệ thống (modul) trong một đoạn văn (xét toàn bộ kịch bản chuẩn + ngoại lệ của modul)** 
1. **Trích tất cả các danh từ xuất hiện trong đoạn văn (kết hợp với các đối tượng trong câu hỏi số 4 của BM)** 
1. Các danh từ liên quan đến người: khách hàng, nhân viên thu ngân, nhân viên quản  lý, nhân viên kỹ thuật, nhân viên, thành viên,  
1. Các danh từ liên quan đến thông tin: xe, lịch, hóa đơn, phụ tùng, dịch vụ, slot, hệ thống, trang web, thông tin, tên, địa chi, số điện thoại, email, đơn giá, số lượng, hãng xe, loại xe, biển số, tổng tiền, ngày, giờ, mô tả 
3. **Đánh giá các danh từ:** 
- Các danh từ trừu tượng: hê thống, trang web, thông tin -> Loại 
- Chỉ để làm thuộc tính: tên, địa chỉ, số điện thoại, email, đơn giá, số lượng, hãng xe, loại xe, biển số, tổng tiền, ngày, giờ, mô tả 
- Đề xuất lớp thực thể :  
- Thành viên hệ thống -> lớp ThanhVien (trừu tượng) : tên, ngày sinh, tên đăng nhập, mật khẩu, địa chỉ, email, số điện thoại 
- Nhân viên -> lớp NhanVien (trừu tượng) : kế thừa lớp thành viên, vị trí 
- Khách hàng -> lớp KhachHang : kế thừa ThanhVien 
- Nhân viên quản lý -> lớp NhanVienQuanLy kế thừa NhanVien 
- Nhân viên thu ngân -> lớp NhanVienThuNgan kế thừa NhanVien 
- Hóa đơn -> lớp HoaDon: tổng tiền, trạng thái, ngày 
- Phụ tùng -> lớp PhuTung: tên, giá, miêu tả 
- Dịch vụ -> lớp DichVu: tên, giá, miêu tả 
- Xe -> lớp Xe: biển số, hãng xe, loại xe 
- Slot -> lớp Slot: tên, miểu tả, giờ 
4. **Xét quan hệ số lượng giữa các danh từ :** 
- Trong 1 hóa đơn có thông tin nhiều xe và xe cũng có thể ở trong nhiều hóa đơn khác nhau -> đề xuất lớp XeTrongHoaDon xác định duy nhất một xe và một hóa đơn 
- Hóa Đơn có thể có nhiều phụ tùng và 1 phụ tùng cũng có thể nằm trong nhiều Hóa Đơn -> đề xuất lớp PhuTungTrongHoaDon xác định duy nhất một hóa đơn và một phụ tùng 
- Hóa Đơn có thể có nhiều dịch vụ và 1 dịch vụ cũng có thể nằm trong nhiều Hóa Đơn -> đề xuất lớp DichVuTrongHoaDon xác định duy nhất một hóa đơn và một dịch vụ 
- Hóa đơn có thông tin 1 khách hàng -> quan hệ giữa HoaDon và KhachHang là 1:1 
- XeTrongHoaDon có thông tin của slot -> quan hệ giữa XeTrongHoaDon và Slot là n:1 
- Nhân viên thu ngân có thể thanh toán nhiều hóa đơn -> quan hệ giữa NhanVienThuNgan và HoaDon 1:n 
- 1 Nhân viên kỹ thuật có thể làm nhiều dịch vụ và 1 dịch vụ có thể nhiều nhân viên kỹ thuật làm -> quan hệ giữa NVKyThuat và DichVuDaSuDung là 1: n 
- 1 Nhân viên kỹ thuật có thể thay thế nhiều phụ tùng và 1 phụ tùng có thể nhiều nhân viên kỹ thuật thay thế -> quan hệ giữa NVKyThuat và PhuTungDaSuDung là 1:n 
5. **Xét quan hệ đối tượng giữa các lớp:** 
- NhanVienThuNgan kế thừa lớp NhanVien 
- NhanVienQuanLy kế thừa lớp NhanVien 
- NhanVienKyThuat kế thừa lớp NhanVien 
- Thông tin KhachHang nằm trong thông tin của HoaDon 
- Thông tin NhanVienThuNgan nằm trong thông tin của HoaDon 
- Thông tin Xe và HoaDon liên kết tạo ra XeTrongHoaDon duy nhất 
- DichVu và XeTrongHoaDon liên kết tạo ra DichVuDaSuDung duy nhất 
- PhuTung và XeTrongHoaDon liên kết tạo ra PhuTungDaSuDung duy nhất 
- Thông  tin KhachHang nằm trong thông tin của Lich 
- Thông tin Slot nằm trong thông tin XeTrongHoaDon 

=> Kết quả : biểu đồ lớp thực thể của hệ thống (modul). 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.009.jpeg)

4. **Biểu đồ trạng thái**  

**Khách thanh toán sau khi nhận xe** 

- Từ giao diện chính của nhân viên thu ngân nếu chọn chức năng thanh toán thì 

chuyển sang giao diện tìm kiếm hóa đơn,**  

- Từ giao diện tìm kiếm hóa đơn nếu chọn chức năng xác nhận thì chuyển sang giao diện xác nhận, nếu chọn thoát thì sẽ quay lại giao diện chính của nhân viên thu ngân** 
- Từ giao diện xác nhận nếu chọn chức đã thanh toán thì hệ thống lưu hóa đơn và kết thúc, nếu chọn thoát sẽ quay lại giao diện chính của nhân viên thu ngân** 
- Từ giao diện xác nhận nếu chọn chức năng chỉnh sửa thì chuyển sang giao diện sửa hóa đơn** 
- Từ giao diện sửa hóa đơn nếu chọn chức năng lưu thì sẽ thông báo thành công và chuyển sang giao diện xác nhận 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.010.png)

**Khách đặt lịch sửa xe** 

- Từ giao diện chính của Khách hàng nếu chọn chức năng đặt lịch được chọn thì 

chuyển sang giao diện đăng kí xe 

- Từ giao diện đăng kí xe. Nếu chọn thêm xe, hệ thống chuyển sang giao diện thêm xe. Nếu chọn xe và click tiếp tục hệ thống chuyển sang giao diện tìm slot trống 
- Tại giao diện thêm xe, sau khi nhập và chọn lưu, hệ thống lưu điểm và chuyển sang giao diện đăng kí xe 
- Tại giao diện đăng kí xe chọn xe và click tiếp tục thì hệ thống chuyển sang giao diện tìm slot trống 
- Tại giao diện tìm slot nếu chọn tiếp tục, hệ thống chuyển sang giao diện xác nhận 
- Tại giao diện xác nhận chọn xác nhận, hệ thống lưu lịch và kết thúc 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.011.png)

**Quản lí thông tin xe của khách – sửa thông tin xe của khách** 

- Từ giao diện chính của quản lí nếu chọn chức năng quản lí xe được chọn thì chuyển sang giao diện quản lí xe 
- Tại giao diện quản lí xe nếu chọn chức năng sửa xe thì sẽ sang giao diện tìm kiếm xe 
- Tại giao diện tìm kiếm xe nếu click vào 1 xe sẽ sang giao diện sửa xe 
- Tại giao diện sửa xe nếu click thêm thì sẽ lưu và kết thúc 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.012.png)

5. **Biểu đồ lớp pha phân tích**  

**Khách thanh toán sau khi nhận xe** 

- Đề xuất các giao diện có tương tác với người dùng chính: 
  - GDDangNhap, GDNhanVienThuNgan, GDTimKiemHoaDon, GDXacNhan 
- Xác định thuộc tính cho lớp biên: 

GDDangNhap 

+ Nhập tài khoản: inTaiKhoan 
+ Nhập mật khẩu: inMatKhau 
+ Nút đăng nhập: subDangNhap 

GDNhanVienThuNgan 

+ Nút thanh toán: subThanhToan 

GDTimKiemHoaDon 

+ Nhập mã hóa đơn: inMaHoaDon 
+ Nút Tìm kiếm: subTimKiem 
+ Nút Xác Nhận: subXacNhans 
+ Bảng Hóa đơn: outHoaDon 

GDXacNhan 

+ Bảng hóa đơn: outHoaDon 
+ Nút xác nhận đã thanh toán: subDaThanhToan 
+ Nút Thoát: subThoat 

GDChinhSuaHoaDon 

+ Bảng hóa đơn: outsubHoaDon 
+ Nhập tên phụ tùng/ dịch vụ : in Ten 
+ Nhập số lượng : inSoLuong 
+ Nút thêm dịch vụ : subThemDichVu 
+ Nút thêm phụ tùng : subThemPhuTung 
+ Nút lưu : subLuu 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.013.jpeg)

GDTimKiemHoaDon: 

Tim hóa đơn theo mã hóa đơn: searchHoaDon() 

Input: mã hóa đơn 

Output: Hóa đơn 

- Gán cho lớp HoaDon 

GDXacNhan 

Lưu Hóa đơn: saveHoaDon() 

Input: Hóa đơn 

Output: Lưu hóa đơn thành công 

- Gán cho lớp HoaDon 

**Khách đặt lịch sửa xe** 

- Đề xuất các giao diện có tương tác với người dùng chính: 
+ GDDangNhap, GDKhachHang,GDDangKiXe, GDThemXe, GDTimKiemSlot, 

GDXacNhan 

- Xác định thuộc tính cho lớp biên: 

GDDangNhap 

Nhập tài khoản: inTaiKhoan 

Nhập mật khẩu: inMatKhau 

Nút đăng nhập: subDangNhap 

GDKhachHang 

Nút đặt lịch sửa xe: subDatLich GDDangKiXe 

Bảng danh sách xe: inoutXe Nút thêm xe: subThem 

Nút tiếp tục: subTiepTuc GDThemXe 

Biển số: inBienSo 

Hãng xe: inHangXe 

Loại xe: inLoaiXe 

Nút xác nhận: subXacNhan GDTimKiemSlot 

Nhập ngày sửa xe: inNgay 

Nút tìm kiếm: subTimKiem Bảng slot : inoutSlot 

Nút tiếp tục: subTiepTuc GDXacNhan 

Bảng danh sách xe: outXe Bảng lịch sửa xe: outLich 

Nút xác nhận : subXacNhan 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.014.png)

GDDangNhap: 

Kiểm tra đăng nhập: checkLogin 

Input: username,password Output: đúng/sai 

- Gán cho lớp ThanhVien 

GDTimKiemSlot: 

Tìm slot theo ngày: searchSlotTrong() 

Input: ngày sửa xe 

Output: danh sách slot 

- Gán cho lớp Slot 

GDXacNhan 

Lưu thông tin lịch: LuuLich() 

Input: Lich 

Output: Đặt lịch thành công 

- Gán cho lớp Lich 

GDThemXe 

Thêm xe mới: ThemXe() 

Input: Xe 

Output: Thêm thành công 

- Gán cho lớp Xe 

GDDangKiXe 

Tim xe đã sửa của khách: searchXe() 

Input: KhachHang 

Output: danh sách xe của khách 

- Gán cho lớp Xe 

**Quản lí thông tin xe của khách – sửa thông tin xe của khách** 

- Đề xuất các giao diện có tương tác với người dùng chính: 
  - GDDangNhap, GDQuanli, GDTimKiemXe. GDSuaXe 
- Xác định thuộc tính cho lớp biên: 

GDDangNhap 

Nhập tài khoản: inTaiKhoan 

Nhập mật khẩu: inMatKhau 

Nút đăng nhập: subDangNhap 

GDQuanLi 

Nút quản lí xe: subQuanLiXe 

GDQuanLiXe 

Nút sửa xe: subSua 

Nút thêm xe: subThem 

Nút xóa xe: subXoa 

GDTimKiemXe 

Nhập tên xe: inTenXe 

Nút tìm kiếm: subTimKiem 

Bảng danh sách xe: inoutXe 

GDSuaXe 

Id xe(chỉ đọc): outId 

Biển số (đọc và chỉnh sửa): inoutBienSo Hãng xe (đọc và chỉnh sửa): inoutHangXe Loại xe (đọc và chỉnh sửa): inoutLoaiXe 

Nút lưu: subSave Nút reset: subReset 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.015.png)

GDTimKiemXe 

Tìm kiếm xe theo tên: searchXe() 

Input: tên xe 

Output: danh sách xe 

- Gán cho lớp Xe 

GDSuaXe 

Lưu thông tin xe sửa: UpdateXe() 

Input: Xe 

Output: boolean 

- Gán cho lớp Xe 
6. **Biểu đồ giao tiếp pha phân tích**

**Khách đặt lịch sửa xe** 

Kich bản v2 

1. Tại giao diện chính của khách hàng, sau khi đăng nhập, khách hàng chọn chức năng đặt lịch sửa xe 
1. Lớp GDKhachHang gọi GDDangKiXe 
1. Lớp GDDangKiXe gọi lớp Xe để tìm danh sách xe đã sửa 
1. Lớp Xe thực hiện hàm searchXe() 
1. Lớp Xe trả về kết quả cho GDDangKiXe 
1. Lớp GDDangKiXe hiển thị kết quả cho khách hàng 
1. Khách hàng click thêm xe mới trên GDDangKiXe 
1. Lớp GDDangKiXe gọi lớp GDThemXe 
1. Lớp GDThemXe hiển thị cho khách hàng 
1. Khách hàng nhập thông tin xe và click thêm 
11. Lớp GDThemXe gọi lớp Xe  
11. Lớp Xe gọi phương thức themXe() 
11. Lớp Xe trả lại lớp GDThemXe 
11. Lớp GDThemXe hiển thị thông báo thêm thành công 
11. Khách hàng bấm vào nút OK của thông báo 
11. Lớp GDThemXe gọi lớp GDDangKiXe 
11. Lớp GDDangKiXe hiển thị kết quả cho khách hàng 
11. Khách hàng tích chọn xe và click tiếp tục trên GDDangKiXe 
11. Lớp GDDangKiXe gọi lớp GDTimSlot 
11. Lớp GDTimSlot trống hiển thị cho khách hàng 
11. Khách hàng nhập ngày muốn sửa và click tìm kiếm trên GDTimSLot 
11. Lớp GDTimSLot gọi lớp SLot 
11. Lớp Slot gọi phương thức searchSlotTrong() 
11. Lớp Slot trả lại kết quả cho lớp GDTimSLot 
11. Lớp GDTimSlot hiển thị kết quả cho khách hàng 
11. Khách hàng chọn slot và click tiếp tục trên GDTimSlot 
11. Lớp GDTimSlot gọi lớp GDXacNhan 
11. Lớp GDXacNhan hiển thị cho khách hàng 
11. Khách hàng click đặt lịch trên GDXacNhan 
11. Lớp GDXacNhan gọi lớp HoaDon 
11. Lớp HoaDon thực hiện hàm saveLich() 
11. Lớp HoaDon trả về kết quả cho GDXacNhan 
11. Lớp GDXacNhan thông báo đặt lịch thành công cho khách hàng 
11. Khách hàng click OK 
11. Lớp GDXacNhan gọi lớp GDKhachHang 
11. GDKhachHang hiển thị cho khách hàng 

-> Biểu đồ giao tiếp 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.016.jpeg)

**Quản lí thông tin xe của khách – sửa thông tin xe của khách** 

Kich bản v2 

1. Khách hàng yêu cầu chỉnh sửa thông tin xe 
1. Người quản lí chọn chức năng quản lí xe trên GDQuanLi 
1. Lớp GDQuanLi gọi lớp GDQuanLiXe để hiển thị 
1. Lớp GDQuanLiXe hiển thị cho người quản lí 
1. Người quản lí chọn trùy chọn chỉnh sửa xe 
1. Lớp GDQuanLiXe gọi lớp GDTimKiemXe 
1. Lớp GDTimKiemXe hiển thị cho người quản lí 
1. Người quản lí nhập từ khóa và bấm vào nút tìm kiếm 
1. Lớp GDTimKiemXe gọi sang lớp Xe 
1. Lớp Xe thực hiện hàm searchXe() 
1. Lớp Xe trả về kết quả cho lớp GDTimKiemXe 
1. Lớp GDTimKiemXe hiển thị kết quả cho người quản lí 
1. Người quản lí chọn một xe để sửa đổi 
1. Lớp GDTimKiemXe gọi lớp GDSuaXe 
1. Lớp GDSuaXe hiển thị thông tin tồn tại của xe đã chọn cho người quản lí 
1. Người quản lí sửa đổi một số thuộc tính và click nút lưu 
1. Lớp GDSuaXe gọi lớp Xe để xử lý 
1. Lớp Xe gọi phương thức updateXe() 
19. Lớp Xe trả về kết quả lớp GDSuaXe 
19. Lớp GDSuaXe hiển thị thông báo thành công cho người quản lí 
19. Người quản lí click nút OK của thông báo 
19. Lớp GDSuaXe gọi lớp GDQuanLi 
19. Lớp GDQuanli hiển thị cho người quản lí 

-> Biểu đồ giao tiếp 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.017.jpeg)

**Khách thanh toán sau khi nhận xe** 

Kich bản v2 

1. Khách hàng đem hóa đơn tạm đến yêu cầu nhân viên thanh toán 
1. NV chọn chức năng thanh toán trên GDNhanVienThuNgan 
1. Lớp GDNhanVienThuNgan gọi lớp GDTimKiemHoaDon để hiển thị 
1. Lớp GDTimKiemHoaDon hiển thị cho NV 
1. NV nhập mã hóa đơn vào GDTimKiemHoaDon và click TimKiem 
1. Lớp GDTimKiemHoaDon gọi sang lớp HoaDon 
1. Lớp HoaDon thực hiện hàm searchHoaDon() 
1. Lớp HoaDon trả về kết quả cho lớp GDTimKiemHoaDon 
1. Lớp GDTimKiemHoaDon hiển thị kết quả cho NV 
1. NV click xác nhận trên GDTimKiemHoaDon 
1. Lớp GDTimKiemHoaDon gọi lớp GDXacNhan 
1. GDXacNhan hiển thị cho NV 
13. NV đọc lại các thông tin của hóa đơn cho KH và yêu cầu KH xác nhận 
13. KH đồng ý và xác nhận 
13. NV nhận tiền thanh toán của khách và click nút DaThanhToan trên GDXacNhan 
13. Lớp GDXacNhan gọi lớp HoaDon 
13. Lớp HoaDon thực hiện hàm luuHoaDon() 
13. Lớp HoaDon trả về kết quả cho lớp GDXacNhan 
13. Lớp GDXacNhan thông báo đặt phòng thành công 
13. NV click OK 
13. Lớp GDXacNhan gọi lớp GDNhanVienThuNgan 
13. GDNhanVienThuNgan hiển thị cho NV 

22\. NV thông báo thành công cho KH. 

- Biếu đồ giao tiếp 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.018.png)

7. **Thiết kế lớp thực thể liên quan**  

**Bước 1: Bổ sung thuộc tính ID cho các lớp không kế thừa từ lớp khácCác lớp được bổ sung là:** NhanVien, KhachHang, HoaDon, Xe, PhuTung, DichVu, XeTrongHoaDon, DichVuDaSuDung, PhuTungDasuDung, Slot, SlotTrongHoaDon, XeCuaKhach 

**Bước 2: Bổ sung kiểu dữ liệu theo ngôn ngữ lập trình JAVA cho tất cả các thuộc tính của các lớp** 

**Bước 3: Chuyển các quan hệ đối tượng** 

Quan hệ Xe – HoaDon -> XeTrongHoaDon chuyển thành 

XeTrongHoaDon chứa Xe và HoaDon 

Quan hệ DichVu và XeTrongHoaDon -> DichVuDaSuDung chuyển thành 

DichVuDaSuDung chứa XeTrongHoaDon và DichVu 

Quan hệ PhuTung và XeTrongHoaDon -> PhuTungDaSuDung chuyển thành 

PhuTungDaSuDung chứa XeTrongHoaDon và PhuTung 

**Bước 4: Bổ sung thuộc tính kiểu đối tượng tương ứng với các quan hệ thành phần** Bổ sung thuộc tính cho XeTrongHoaDon : 

XeTrongHoaDon – Xe (n-1) : bổ sung thuộc tính xe 

XeTrongHoaDon – DichVuDaSuDung (1-n) : bổ sung thuộc tính listDichVuDaSuDung 

XeTrongHoaDon – PhuTungDaSuDung (1-n) : bổ sung thuộc tính listPhuTungDaSuDung 

XeTrongHoaDon – Slot(n:1) : bổ sung thuộc tính Slot 

Bổ sung thuộc tính cho HoaDon: 

HoaDon – KhachHang (n-1) : bổ sung thuộc tính khachHang 

HoaDon – XeTrongHoaDon (1-n) : bổ sung thuộc tính listXeTrongHoaDon 

HoaDon – NhanVienThuNgan (1-1) : bổ sung thuộc tính nhanVienThuNgan Bổ Sung thuộc tính cho DichVuDaSuDung: 

DichVuDaSuDung – DichVu (n-1) : bổ sung thuộc tính dichVu 

Bổ Sung thuộc tính cho PhuTungDaSuDung: 

PhuTungDaSuDung – PhuTung (n-1) : bổ sung thuộc tính phuTung 

Bổ sung thuộc tính cho KhachHang: 

KhachHang – XeCuaKhach (1-n) : bổ sung thuộc tính listXe 

Bổ sung thuộc tính cho NhanVienKyThuat: 

NhanVienKyThuat – DichVuDaSuDung (1:n) : bổ sung thuộc tính 

listDichVuDaSuDung 

NhanVienKyThuat – PhuTungDaSuDung (1:n): bổ sung thuộc tính listPhuTungDaSuDung 

èBiểu đồ lớp thực thể pha thiết kế 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.019.jpeg)

**VIII. Thiết kế CSDL liên quan**  

**Bước 1: Mỗi lớp thực thể đề xuất thành 1 bảng trong CSDL** 

Lớp XeTrongHoaDon -> bảng tblXeTrongHoaDon 

Lớp DichVuDaSuDung -> bảng tblDichVuDaSuDung 

Lớp PhuTungDaSuDung -> bảng tblPhuTungDaSuDung 

Lớp DichVu -> bảng tblDichVu 

Lớp PhuTung -> bảng tblPhuTung 

Lớp KhachHang -> bảng tblKhachHang 

Lớp HoaDon -> bảng tblHoaDon 

Lớp NhanVien-> bảng tblNhanVien 

Lớp NhanVienThuNgan-> bảng tblNhanVienThuNgan 

Lớp NhanVienKyThuat -> bảng tblNhanVienKyThuat 

Lớp Xe-> bảng tblXe 

Lớp Slot -> bảng tblSlot 

**Bước 2: Các thuộc tính không phải dạng đối tượng => chuyển thành thuộc tính của bảng tương ứng** 

tblNhanVien có các thuộc tính: ID, Ten, Taikhoan, MatKhau, Vaitro, Hesoluong, NgaySinh, Email, Sdt 

tblXeTrongHoaDon có các thuộc tính: ID 

tblXe có các thuộc tính: ID, Bienso, Hangxe, Loaixe 

tblDichVuDaSuDung: ID, Soluong, Gia, Thanhtien 

tblLinhKienDaSuDung: ID, Soluong, Gia, Thanhtien 

tblDichVu:ID, Ten, Gia, Mieuta 

tblLinhKien:ID, Ten, Gia, Mieuta 

tblKhachHang: ID, Ten, Diachi, Sdt, Email 

tblHoaDon: ID, Tongtien 

tblNhanVienThuNgan: ID 

tblSlot : ID, ten, gio 

**Bước 3: Quan hệ số lượng giữa các lớp thực thể => Quan hệ giữa các bảng tương ứng** 

tblXe – tblXeTrongHoaDon : 1-n 

tblXeTrongHoaDon – tblHoaDon : n-1 

tblDichVuDaSuDung – tblDichVu: n-1 

tblDichVuDaSuDung – tblXeTrongHoaDon: n-1 

tblLinhKienDaSuDung – tblLinhKien: n-1 

tblLinhKienDaSuDung – tblXeTrongHoaDon: n-1 

tblKhachHang – tblHoaDon: 1-n 

tblNhanVienThuNgan – tblHoaDon : 1-n 

tblNhanVienKyThuat – tblDichVuDaSuDung : 1-n 

tblNhanVIenKyThuat – tblPhuTungDaSuDung: 1-n 

tblSlot – tblXeTrongHoaDon : 1-n 

tblXe – tblKhach : n-1 

**Bước 4: Bổ sung khóa** 

tblXe – tblXeTrongHoaDon : 1-n => Bảng tblXeTrongHoaDon có khóa ngoại là xe tblXeTrongHoaDon – tblHoaDon : n-1 => Bảng n có khoái ngoại là hoaDon tblDichVuDaSuDung – tblDichVu: n-1 => Bảng n có khoái ngoại là dichVu tblDichVuDaSuDung – tblXeTrongHoaDon: n-1 => Bảng n có khoái ngoại là xeTronHoaDon 

tblLinhKienDaSuDung – tblLinhKien: n-1 => Bảng n có khoái ngoại là linhKien tblLinhKienDaSuDung – tblXeTrongHoaDon: n-1 => Bảng n có khoái ngoại là xeTronHoaDon 

tblLinhKienDaSuDung – tblNhanVienKyThuat: n-1 => Bảng n có khóa ngoài là nhanVienKyThuat 

tblDichVuDaSuDung – tblNhanVienKyThuat: n-1 => Bảng n có khóa ngoài là nhanVienKyThuat 

tblKhachHang – tblHoaDon: 1-n => Bảng n có khoái ngoại là khachHang tblNhanVienThuNgan – tblHoaDon : 1-n => Bảng n có khoái ngoại là nhanVienThuNgan 

tblSlot – tblXeTrongHoaDon : 1-n => Bảng n có khoái ngoại là XeTrongHoaDon **Bước 5: Loại bỏ thuộc tính dưa thừa trùng lặp** 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.020.jpeg)

9. **Thiết kế BD đồ lớp (3 chức năng)**

**Khách thanh toán sau khi nhận xe** 

- Đề suất lớp giao diện tương ứng: gdNhanvienthungan.jsp, gdTimhoadon.jsp, gd Xacnhan.jsp, gdChinhsuaHD.jsp 
- Thuộc tính: 
  - gdNhanvienthungan: btnThanhtoan, btnThoat 
  - gdTimhoadon: btnTimkiem, txtTimkiem, tblDichVu, tblPhuTung 
  - gdXacNhan: tblDichVu, tblPhuTung, btnXacNhan, btnThoat, btnChinhSua, tblXe 
  - gdChinhsuaHD : tblDichVu, tblPhuTung, txtTen, txtSoLuong, btnLuu 
- Đề xuất các lớp DAO: HoaDonDAO, DichVuDAO, PhuTungDAO 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.021.jpeg)

**Khách đặt lịch sửa xe** 

- Đề suất lớp giao diện tương ứng: gdLogin.jsp, gdQuanli.jsp, gdQuanlixe.jsp, gdTimkiemxe.jsp, gdSuaxe.jsp 
- Thuộc tính: 
  - gdKhachhang: btnDatLich, btnThoat 
  - gdDangkixe: btnThem, btnTiepTuc, tblXe 
  - gdThemxe: txtBienSo, txtHangXe, txtLoaiXe, btnXacNhan 
  - gdTimkiemslot: txtNgay, subTimKiem, btnTiepTuc, tblSlot 
  - gdXacnhan: tblXe, tblLich, btnXacNhan 
- Đề xuất các lớp DAO:SlotDAO, XeDAO, HoaDonDAO 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.022.jpeg)

**Quản lí thông tin xe của khách – sửa thông tin xe của khách** 

- Đề suất lớp giao diện tương ứng: gdLogin.jsp, gdQuanli.jsp, gdQuanlixe.jsp, gdTimkiemxe.jsp, gdSuaxe.jsp 
- Thuộc tính: 
  - gdLogin: txtUsername, txtPassword, btnLogin 
  - gdQuanli : btnQuanlixe 
  - gdQuanlixe: btnSua, btnThem, btnXoa 
  - gdTimkiemxe: txtTen, btnTim, tblXe 
  - gdSuaxe: btnSave, btnReset 
- Đề xuất các lớp DAO: ThanhVienDAO, XeDAO 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.023.jpeg)

10. **Thiết kế BD hoạt động**  

**Khách thanh toán sau khi nhận xe** 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.024.jpeg)

**Khách đặt lịch sửa xe** 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.025.jpeg)

**Quản lí thông tin xe của khách – sửa thông tin xe của khách** 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.026.jpeg)

11. **Thiết kế BD tuần tự**  

**Khách thanh toán sau khi nhận xe** 

1. Khách hàng đem hóa đơn tạm đến và yêu cầu nhân viên thu ngân thanh toán 
2. Tại trang gdNhanvienthungan.jsp, sau khi đăng nhập, nhân viên thu ngân chọn chức năng thanh toán 
2. Trang gdNhanvienthungan.jsp gọi trang gdTimhoadon.jsp 
2. Trang gdTimhoadon.jsp hiển thị cho nhân viên thu ngân 
2. Nhân viên thu ngân nhập mã hóa đơn và click tìm kiếm 
2. Trang gdTimhoadon.jsp gọi lớp HoaDonDAO yêu cầu tìm hóa đơn có chứa từ khóa của nhân viên nhập 
2. Lớp HoaDonDAO gọi hàm searchHoaDon() 
2. Hàm searchHoaDon() gọi lớp HoaDon để đóng gói thông tin 
2. Lớp HoaDon đóng gói thông tin thực thể 
2. Lớp HoaDon trả về kết quả cho hàm searchHoaDon() 
2. Hàm searchHoaDon() gọi lớp Xe 
2. Lớp Xe đóng gói thông tin thực thể 
2. Lớp Xe trả về kết quả cho hàm searchHoaDon() (Lặp lại bước 11-13 đến khi đóng gói hết các đối tượng Xe) 
2. Hàm searchHoaDon() gọi lớp DichVu để đóng gói thông tin 
2. Lớp DichVu đóng gói thông tin  
2. Lớp DichVu trả về kết quả cho hàm searchHoaDon() (Lặp lại bước 14-16 đến khi đóng gói hết các đối tượng DichVu) 
2. Hàm searchHoaDon() gọi lớp PhuTung để đóng gói thông tin 
2. Lớp PhuTung đóng gói thông tin  
2. Lớp PhuTung trả về kết quả cho hàm searchHoaDon() (Lặp lại bước 17-19 đến khi đóng gói hết các đối tượng DichVu) 
2. Hàm searchHoaDon trả về kết quả cho trang gdTimhoadon.jsp 
2. Trang gdTimHoaDon.jsp hiển thị cho nhân viên thu ngân 
2. Nhân viên thu ngân chọn xác nhận 
2. Trang gdTimhoadon.jsp gọi trang gdXacNhan.jsp 
2. Trang gdXacNhan.jsp hiển thị lên cho nhân viên thu ngân 
2. Nhân viên thu ngân hỏi khách hàng xác nhận 
2. Khách hàng xác nhận thông tin hóa đơn chính xác 
2. Nhân viên thu ngân click đã thanh toán 
2. Trang gdXacnhan.jsp gọi trang doLuuHD.jsp 
2. Trang doLuuHD.jsp gọi lớp HoaDonDAO yêu cầu lưu 
2. Lớp HoaDonDAO gọi hàm luuHoaDon() 
2. Lớp HoaDonDAO trả lại lớp doLuuHD.jsp 
2. Lớp doLuuHD.jsp thông báo thành công 
2. Nhân viên thu ngân click OK của thông báo 
2. Trang doLuuHD.jsp gọi lại trang gdNhanvienthungan.jsp 
2. Trang gdNhanvienthungan.jsp hiển thị cho nhân viên thu ngân 
2. Nhân viên thu ngân thông báo thanh toán thành công cho khách hàng 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.027.jpeg)

**Khách đặt lịch sửa xe** 

1. Tại trang gdKhachhang.jsp, sau khi đăng nhập, khách hàng chọn chức năng đặt lịch 
1. Trang gdKhachhang.jsp gọi trang gdDangkixe.jsp 
1. Trang gdDangkixe.jsp gọi lớp XeDAO yêu cầu lấy thông tin xe đã có của khách hàng 
1. Lớp XeDAO gọi hàm getXe() 
1. Hàm getXe() gọi lớp Xe để đóng gói thống tin 
1. Lớp Xe đóng gói thông tin thực thể 
1. Lớp Xe trả kết quả lại cho hàm getXe() (Lặp lại bước 5-7 đến khi đóng gói hết các đối tượng Xe và XeTrongHoaDon cho danh sách các Xe) 
1. Hàm getXe() trả kết quả lại cho trang gdDangkixe.jsp 
1. Trang gdDangkixe.jsp hiển thị cho khách hàng 
1. Khách hàng tích chọn 1 xe cần sửa và click tiếp tục 
1. Trang gdDangkixe.jsp gọi trang gdTimkiemslot.jsp 
1. Trang gdTimkiemslot.jsp hiển thị lên cho khách hàng 
1. Khách hàng chọn ngày và click tìm kiếm 
1. Trang gdTimkiemslot.jsp gọi lớp SlotDAO yêu cầu tìm slot trống và đã chọn 
1. Lớp SlotDAO gọi hàm searchSlot()  
16. Hàm searchSlot() gọi lớp Slot để đóng gói thông tin 
16. Lớp Slot đóng gói thông tin thực thể 
16. Lớp Slot trả về kết quả cho hàm searchSlot() (Lặp lại bước 16-18 đến khi đóng gói hết các đối tượng Slot cho danh sách các slot) 
16. Hàm searchSlot() trả về kết quả cho trang gdTimkiemslot.jsp 
16. Trang gdTimkiemslot.jsp hiển thị cho khách hàng 
16. Khách hàng tích chọn các slot mà mình muốn đặt sau đó click tiếp tục 
16. Trang gdTimkiemslot.jsp gọi trang gdXacNhan,jsp 
16. Trang gdXacnhan.jsp gọi lớp HoaDon để đóng gói dữ liệu các slot và xe của khách hàng đã chọn vào hóa đơn 
16. Lớp HoaDon đóng gói dữ liệu 
16. Lớp HoaDon trả về kết quả cho trang gdXacnhan.jsp 
16. Trang gdXacnhan.jsp hiển thị cho khách hàng 
16. Khách hàng click đặt lịch 
16. Trang gdXacnham.jsp gọi Trang doLuuLich.jsp 
16. Trang doLuulich.jsp gọi   lớp HoaDonDAO để lưu thông tin 
16. Lớp HoaDonDAO gọi hàm luuLichDat() 
16. Hàm luuLichDat() trả về kết quả lưu thành công cho trang doLuulich.jsp 
16. Trang doLuulich.jsp hiển thị thông báo đựat lịch thành công cho khách hàng 
16. Khách hàng click OK 
16. Trang doLuulich.jsp gọi trang gdKhachhang.jsp 
16. Trang gdKhachhang.jsp hiển thị lên cho khách hàng 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.028.jpeg)

**Quản lí thông tin xe của khách – sửa thông tin xe của khách** 

1. Khách hàng yêu cầu chỉnh sửa thông tin của xe 
1. Người quản lí nhập tên người dùng, mật khẩu và nhấp nút đăng nhập trên gdLogin.jsp 
1. Trang gdLogin.jsp gọi trang doLogin.jsp 
1. Trang doLogin.jsp gọi Lớp ThanhVien để tạo một đối tượng thành viên 
1. Lớp ThanhVien đóng gói thông tin vào một đối tượng ThanhVien 
1. Lớp ThanhVien trả về đối tượng thành viên cho trang doLogin.jsp 
1. Trang doLogin.jsp gọi Lớp ThanhVienDAO  
1. Lớp ThanhVienDAO gọi hàm checkLogin() để kiểm tra thông tin đăng nhập 
1. Hàm checkLogin() gọi Lớp ThanhVien dặt thêm hai thuộc tín tên, vị trí 
1. Lớp ThanhVien gọi phương thức setName, setPosition()  
1. Lớp ThanhVien trả về đối tượng ThanhVien cho phương thức checkLogin() 
1. Phương thức checkLogin() trả về kết quả cho Trang doLogin.jsp 
1. Trang doLogin.jsp gọi Trang gdQuanLi.jsp 
1. Trang gdQuanLi.jsp được hiển thị cho người quản lí 
1. Người quản lí bẩm nút quản lí xe 
1. Trang gdQuanli.jsp gọi trang gdQuanlixe.jsp 
1. Trang gdQuanlixe.jsp hiển thị cho người quản lí 
18. Người quản lí bấm vào nút chỉnh sửa xe 
18. Trang gdQuanlixe gọi trang gdTimkiemxe.jsp 
18. Trang gdTimkiemxe.jsp hiển thị cho người quản lí 
18. Người quản lí nhập tên xe và nhấp vào nút tìm kiếm 
18. Trang gdTimkiemxe.jsp gọi phương thức searchXe() của lớp XeDAO 
18. Hàm searchXe() tìm kiếm xe theo tên. 
18. Hàm searchXe() gọi class Xe để đóng gói kết quả 
18. Lớp Xe đóng gói đối tượng Xe 
18. Lớp Xe trả về đối tượng Xe cho phương thức searchXe() 
18. Phương thức searchXe() trả về kết quả cho Trang gdTimkiemxe.jsp 
18. Trang gdTimkiemxe.jsp hiển thị kết quả cho cho người quản lí 
18. Người quản lí bấm vào một xe trong danh sách để chỉnh sửa 
18. Trang gdTimkiemxe.jsp gọi Trang gdSuaxe.jsp 
18. Trang gdSuaxe.jsp hiển thị cho người quản lí 
18. Người quản lí sửa đổi một số thuộc tính và sau đó bấm nút lưu 
18. Trang gdSuaxe.jsp gọi  Trang doSuaxe.jsp 
18. Trang doSuaxe.jsp gọi lớp Xe để thiết lập các thuộc tính đã sửa đổi 
18. Lớp Xe thiết lập các thuộc tính sửa đổi thành một đối tượng Xe 
18. Lớp Xe trả về kết quả cho doSuaxe.jsp 
18. Trang doSuaxe.jsp gọi phương thức updateXe() của lớp XeDAO 
18. Phương thức updateXe() thực thi 
18. Phương thức updateXe() trả về Trang gdSuaxe.jsp 
18. Trang doSuaxe.jsp hiển thị thông báo sửa thành công 
18. Người quản lí click OK 
18. Trang doSuaxe.jsp gọi Trang gdQuanli.jsp 
18. Trang gdQuanli.jsp hiển thị cho quản lí 
18. Quản lí thông báo thành công cho khách hàng 

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.029.jpeg)

12. **Thiết kế BD gói/triển khai**  

Áp dụng cho hệ thống, các package được thiết kế:

- Các lớp thực thể đặt chung trong gói model
- Các lớp DAO đặt chung trong gói DAO.
- Các trang jsp để trong gói view. Gói view được chia nhỏ thành các gói nhỏ hơn tương ứng với các giao diện cho các người dùng khác nhau:
  - Các trang thao tác cho đăng nhập, quản lí mật khẩu đặt trong gói thanhvien.
  - Các trang cho chức năng liên quan đến khách hàng  đặt trong gói khachhang
  - Các trang cho chức năng liên quan đến nhân viên quản lí đặt trong gói nhanvienquanly
  - Các trang cho chức năng liên quan đến nhân viên tại quầy đặt trong gói nhanvienthungan

![](Aspose.Words.b682f861-31d4-448a-bc57-037292896872.030.jpeg)
