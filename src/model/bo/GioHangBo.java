package model.bo;

import java.util.ArrayList;

import model.bean.GioHang;

public class GioHangBo {
	private ArrayList<GioHang> monAnTrongGioHang = new ArrayList<>();
	public ArrayList<GioHang> getGH(){
		return monAnTrongGioHang;
	}
	public void them(String maMonAn, int soLuong, int giaBan ) {
		int monAns = monAnTrongGioHang.size();
		for (int i = 0; i < monAns; i++) {
			
			if(monAnTrongGioHang.get(i).getMaMonAn().equals(maMonAn)) {
				
				int soLuongMoi = monAnTrongGioHang.get(i).getSoLuong() + 1;
				monAnTrongGioHang.get(i).setSoLuong(soLuongMoi);
				int giaBanCu = monAnTrongGioHang.get(i).getGiaBan();
				int tongTien = giaBanCu * soLuongMoi;
				monAnTrongGioHang.get(i).setGiaBan(giaBanCu);
				monAnTrongGioHang.get(i).setTongTien(tongTien);
				
				return;
			}
		}
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		GioHang gioHang = new GioHang(maMonAn, 1, giaBan);
		gioHang.setTongTien(giaBan);
		monAnTrongGioHang.add(gioHang);
	}
	
	public ArrayList<GioHang> xoa (String maMonAn){
		int monAns = monAnTrongGioHang.size();
		for (int i = 0; i < monAns; i++) {
			if(monAnTrongGioHang.get(i).getMaMonAn().equals(maMonAn)) {
				monAnTrongGioHang.remove(i);
				break;
			}
		}
		return monAnTrongGioHang;
	}
	
	public int tongTien() {
		int monAns = monAnTrongGioHang.size();
		int tongTien = 0;
		
		for (int i = 0; i < monAns; i++) {
			tongTien += monAnTrongGioHang.get(i).getTongTien();
		}
		return tongTien;
	}
}
