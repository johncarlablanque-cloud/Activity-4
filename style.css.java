 {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Segoe UI', Georgia, serif;
}

body {
    background-color: #f8f4e8;
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
    padding: 20px;
}

/* Standard business card size: 3.5 × 2 inches */
.business-card {
    width: 3.5in;
    height: 2in;
    background-color: #FFD700; /* Bright Yellow background */
    border-radius: 12px;
    display: flex;
    overflow: hidden;
    box-shadow: 0 8px 22px rgba(0,0,0,0.25);
    border: 2px solid #E6B800;
}

/* Left panel: Villa / Resort picture */
.card-image {
    width: 38%;
    height: 100%;
    background: url('https://images.unsplash.com/photo-1566073771259-6a8506099945?w=300&h=200&fit=crop') center/cover no-repeat;
    position: relative;
}

.image-overlay {
    position: absolute;
    inset: 0;
    background: rgba(0,0,0,0.12);
}

/* Right panel: Text details */
.card-content {
    width: 62%;
    padding: 14px 12px;
    display: flex;
    flex-direction: column;
    justify-content: center;
    color: #2C2C2C;
}

.brand-name {
    font-size: 19px;
    font-weight: 800;
    letter-spacing: 0.6px;
    color: #1A1A1A;
    line-height: 1.2;
}

.position-line {
    font-size: 11px;
    font-weight: 600;
    color: #553C00;
    margin: 3px 0 6px;
}

.divider {
    width: 50px;
    height: 2px;
    background-color: #996600;
    margin-bottom: 7px;
}

.info-text {
    font-size: 10px;
    line-height: 1.6;
    color: #2B2B2B;
}

/* For clean printing */
@media print {
    body { background: white; }
    .business-card { box-shadow: none; }
}

/* Fits well on phones */
@media (max-width: 420px) {
    .business-card { transform: scale(0.92); }
}