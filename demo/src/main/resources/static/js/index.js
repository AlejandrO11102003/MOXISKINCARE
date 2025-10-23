// Productos de The Ordinary
const products = [
    {
        id: 1,
        name: "Niacinamide 10% + Zinc 1%",
        category: "serums",
        description:
            "Reduce la apariencia de poros y controla el exceso de sebo.",
        price: "$30.00",
        image: "https://images.unsplash.com/photo-1747915102147-d1ea81052a4c?ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&q=80&w=1893",
        badge: "BEST SELLER",
    },
    {
        id: 2,
        name: "Hyaluronic Acid 2% + B5",
        category: "hidratantes",
        description: "Hidratación intensa para todo tipo de piel.",
        price: "$45.00",
        image: "https://theordinary.es/wp-content/uploads/2020/12/the-ordinary-hyaluronic-acid-2-b5-60ml-serum-acido-hialuronico.webp",
        badge: "HIDRATACIÓN",
    },
    {
        id: 3,
        name: "AHA 30% + BHA 2% Peeling Solution",
        category: "acidos",
        description: "Exfoliante facial de alta resistencia para piel experta.",
        price: "$38.00",
        image: "https://images.unsplash.com/photo-1696025522422-aa9a74e4f3d5?ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&q=80&w=765",
        badge: "EXFOLIANTE",
    },
    {
        id: 4,
        name: "Caffeine Solution 5% + EGCG",
        category: "serums",
        description: "Reduce la apariencia de bolsas y ojeras.",
        price: "$30.00",
        image: "https://images.unsplash.com/photo-1681907426484-51e29e6e5e0c?ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&q=80&w=1172",
        badge: "OJERAS",
    },
    {
        id: 5,
        name: "Ascorbic Acid 8% + Alpha Arbutin 2%",
        category: "antioxidantes",
        description:
            "Sérum antioxidante que ilumina y unifica el tono de la piel.",
        price: "$48.00",
        image: "https://theordinary.com/dw/image/v2/BFKJ_PRD/on/demandware.static/-/Sites-deciem-master/default/dwa0a0786e/Images/products/The%20Ordinary/rdn-100pct-AscorbicAcid8+AlphaArbutin2-Product-30ml.png?sw=900&sh=900&sm=fit",
        badge: "ILUMINADOR",
    },
    {
        id: 6,
        name: "Lactic Acid 10% + HA 2%",
        category: "acidos",
        description: "Exfoliante suave que mejora textura y tono de la piel.",
        price: "$11.50",
        image: "https://blumie.pe/cdn/shop/files/p427413-av-01-zoom_jpg.webp?v=1711820820&width=1445",
        badge: "EXFOLIACIÓN",
    },
    {
        id: 7,
        name: "Natural Moisturizing Factors + HA",
        category: "hidratantes",
        description: "Hidratante facial con factores de hidratación natural.",
        price: "$52.00",
        image: "https://images.unsplash.com/photo-1679394042175-717ca34ef0f2?ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&q=80&w=627",
        badge: "HIDRATACIÓN",
    },
    {
        id: 8,
        name: "Glycolic Acid 7% Toning Solution",
        category: "acidos",
        description:
            "Tónico exfoliante que mejora la textura y claridad de la piel.",
        price: "$30.00",
        image: "https://alexandrahidalgo.pe/cdn/shop/products/30.png?v=1674526203",
        badge: "TÓNICO",
    },
    {
        id: 9,
        name: "100% Plant-Derived Squalane",
        category: "hidratantes",
        description: "Aceite facial ligero que hidrata sin obstruir poros.",
        price: "$30.00",
        image: "https://topbeauty.pe/wp-content/uploads/2025/10/Sin-titulo-1080-x-1080-px-3.jpg",
        badge: "HIDRATANTE",
    },
    {
        id: 10,
        name: "Resveratrol 3% + Ferulic Acid 3%",
        category: "antioxidantes",
        description:
            "Potente antioxidante que protege contra el estrés ambiental.",
        price: "$28.00",
        image: "https://uperfect.pe/cdn/shop/files/IMAGEN2_4a9cf937-d7d8-4279-a2bd-0fa00a065797.png?v=1732221007",
        badge: "ANTIOXIDANTE",
    },
    {
        id: 11,
        name: "Azelaic Acid Suspension 10%",
        category: "acidos",
        description: "Crema que unifica el tono y textura de la piel.",
        price: "$45.00",
        image: "https://m.media-amazon.com/images/I/51kKAqJ9t5L.jpg_BO30,255,255,255_UF900,850_SR1910,1000,0,C_QL100_.jpg",
        badge: "UNIFICADOR",
    },
    {
        id: 12,
        name: "Buffet + Copper Peptides 1%",
        category: "serums",
        description:
            "Sérum antienvejecimiento con tecnología de péptidos de cobre.",
        price: "$50.00",
        image: "https://www.wortheecosmetics.com/cdn/shop/files/Multi-Peptide-_-Copper-1.jpg?v=1710144614&width=1500",
        badge: "PREMIUM",
    },
];

// Función para renderizar productos
function renderProducts(filter = "all") {
    const container = document.getElementById("products-container");
    container.innerHTML = "";

    const filteredProducts =
        filter === "all"
            ? products
            : products.filter((product) => product.category === filter);

    filteredProducts.forEach((product) => {
        const productElement = document.createElement("div");
        productElement.className = "product-card fade-in";
        productElement.innerHTML = `
                    ${
                        product.badge
                            ? `<div class="product-badge">${product.badge}</div>`
                            : ""
                    }
                    <img src="${product.image}" alt="${
            product.name
        }" class="product-image">
                    <div class="product-info">
                        <span class="product-category">${
                            product.category
                        }</span>
                        <h3 class="product-title">${product.name}</h3>
                        <p class="product-description">${
                            product.description
                        }</p>
                        <div class="product-price">${product.price}</div>
                    </div>
                `;
        container.appendChild(productElement);
    });
}

// Filtrado de productos
document.addEventListener("DOMContentLoaded", function () {
    renderProducts();

    const filterButtons = document.querySelectorAll(".filter-btn");
    filterButtons.forEach((button) => {
        button.addEventListener("click", function () {
            // Remover clase active de todos los botones
            filterButtons.forEach((btn) => btn.classList.remove("active"));
            // Agregar clase active al botón clickeado
            this.classList.add("active");
            // Filtrar productos
            const filter = this.getAttribute("data-filter");
            renderProducts(filter);
        });
    });

    // Navbar scroll effect
    window.addEventListener("scroll", function () {
        const navbar = document.querySelector(".navbar");
        if (window.scrollY > 50) {
            navbar.classList.add("scrolled");
        } else {
            navbar.classList.remove("scrolled");
        }
    });

    // Smooth scrolling para enlaces internos
    document.querySelectorAll('a[href^="#"]').forEach((anchor) => {
        anchor.addEventListener("click", function (e) {
            e.preventDefault();
            const target = document.querySelector(this.getAttribute("href"));
            if (target) {
                target.scrollIntoView({
                    behavior: "smooth",
                    block: "start",
                });
            }
        });
    });
});
