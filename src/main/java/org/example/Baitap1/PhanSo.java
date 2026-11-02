package org.example.Baitap1;

public class PhanSo {


        private int tuSo;
        private int mauSo;

        public PhanSo() {
            tuSo = 0;
            mauSo = 1;
        }

        public PhanSo(int tuSo, int mauSo) {
            this.tuSo = tuSo;
            this.mauSo = mauSo;
        }

        public int getTuSo() {
            return tuSo;
        }

        public void setTuSo(int tuSo) {
            this.tuSo = tuSo;
        }

        public int getMauSo() {
            return mauSo;
        }

        public void setMauSo(int mauSo) {
            if (mauSo != 0) {
                this.mauSo = mauSo;
            }
        }

        public String toString() {
            return tuSo + "/" + mauSo;
        }

        public int ucln(int a, int b) {
            a = Math.abs(a);
            b = Math.abs(b);

            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }

            return a;
        }

        public PhanSo rutGon() {
            int u = ucln(tuSo, mauSo);

            if (u != 0) {
                tuSo = tuSo / u;
                mauSo = mauSo / u;
            }

            if (mauSo < 0) {
                tuSo = -tuSo;
                mauSo = -mauSo;
            }

            return this;
        }

        public PhanSo cong(PhanSo p) {
            PhanSo kq = new PhanSo(
                    tuSo * p.mauSo + p.tuSo * mauSo,
                    mauSo * p.mauSo
            );

            return kq.rutGon();
        }

        public PhanSo tru(PhanSo p) {
            PhanSo kq = new PhanSo(
                    tuSo * p.mauSo - p.tuSo * mauSo,
                    mauSo * p.mauSo
            );

            return kq.rutGon();
        }

        public PhanSo nhan(PhanSo p) {
            PhanSo kq = new PhanSo(
                    tuSo * p.tuSo,
                    mauSo * p.mauSo
            );

            return kq.rutGon();
        }

        public PhanSo chia(PhanSo p) {
            if (p.tuSo == 0) {
                throw new ArithmeticException("Khong the chia cho 0");
            }

            PhanSo kq = new PhanSo(
                    tuSo * p.mauSo,
                    mauSo * p.tuSo
            );

            return kq.rutGon();
        }

        public int soSanh(PhanSo p) {
            int a = tuSo * p.mauSo;
            int b = p.tuSo * mauSo;

            return Integer.compare(a, b);
        }

        public boolean laSoNguyen() {
            return tuSo % mauSo == 0;
        }
    }


