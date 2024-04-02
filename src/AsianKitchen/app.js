const menu = [
  {
    id: 1,
    title: "Tteokbokki",
    category: "Korea",
    price: 10.99,
    img:
      "https://twoplaidaprons.com/wp-content/uploads/2020/09/tteokbokki-top-down-view-of-tteokbokki-in-a-bowl-500x500.jpg",
    desc: `Spicy rice cakes, serving with fish cake.`,
  },
  {
    id: 2,
    title: "Chicken Ramen",
    category: "Japan",
    price: 7.99,
    img:
      "https://www.forkknifeswoon.com/wp-content/uploads/2014/10/simple-homemade-chicken-ramen-fork-knife-swoon-01.jpg",
    desc: `Chicken noodle soup, serving with vegetables such as soy bean, green onion. In an optional you can ask for egg. `,
  },
  {
    id: 3,
    title: "Bibimbap",
    category: "Korea",
    price: 8.99,
    img:
      "https://dwellbymichelle.com/wp-content/uploads/2020/05/DWELL-bibimbap.jpg",
    desc: `Boiling vegetables, serving with special hot sauce`,
  },
  {
    id: 4,
    title: "Dan Dan Mian",
    category: "China",
    price: 5.99,
    img:
      "data:image/jpeg;base64,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",
    desc: `Dan dan noodle, serving with green onion `,
  },
  {
    id: 5,
    title: "Yangzhou Fried Rice",
    category: "China",
    price: 12.99,
    img:
      "https://salu-salo.com/wp-content/uploads/2013/02/Yangzhou-Fried-Rice1.jpg",
    desc: `Yangzhou style fried rice, serving with bean and pickles `,
  },
  {
    id: 6,
    title: "Onigiri",
    category: "Japan",
    price: 9.99,
    img:
      "https://www.manusmenu.com/wp-content/uploads/2017/08/Onigiri-3-1-of-1.jpg",
    desc: `Rice Sandwich, serving with soy sauce`,
  },
  {
    id: 7,
    title: "Jajangmyeon",
    category: "Korea",
    price: 15.99,
    img:
      "https://www.curiouscuisiniere.com/wp-content/uploads/2020/04/Jajangmyeon-Korean-Noodles-in-Black-Bean-Sauce5.1200H-720x540.jpg",
    desc: `Black bean sauce noodle, serving with green onion `,
  },
  {
    id: 8,
    title: "Ma Yi Shang Shu",
    category: "China",
    price: 12.99,
    img:
      "https://assets.tmecosys.com/image/upload/t_web767x639/img/recipe/ras/Assets/F688C2F6-86EC-46C4-B9C7-A6BA01DF7437/Derivates/32E3E72A-F786-406D-AF7F-B30980A9AC6C.jpg",
    desc: `Hot pepper sauce noodle, serving with soy bean and onion`,
  },
  {
    id: 9,
    title: "Doroyaki",
    category: "Japan",
    price: 3.99,
    img:
      "https://www.justonecookbook.com/wp-content/uploads/2011/10/Dorayaki-New-500x400.jpg",
    desc: `Red bean paste dessert, serving with honey.`,
  },
];


document.addEventListener("DOMContentLoaded", function () {
  var allBtn = document.getElementById("allBtn");
  allBtn.focus();
  allBtn.click();

  allBtn.addEventListener("click", function () {
    filteredMenu("All");
  });
});

var menuSection = document.querySelector('.section-center');
var buttons = document.querySelectorAll('.btn-item');

buttons.forEach(btn => {
  btn.addEventListener('click', function () {
    var category = btn.getAttribute('data-id');
    filteredMenu(category);
  });
});

function filteredMenu(category) {
  if (category === 'All') {
    showMenuItems(menu);
  } else {
    const filteredMenu = menu.filter(item => item.category === category);
    showMenuItems(filteredMenu);
  }
}

function showMenuItems(menuItems) {
  let htmls = menuItems.map(item => {
    return `
      <div class="menu-items col-lg-6 col-sm-12">
        <img src="${item.img}" alt="${item.title}" class="photo" />
        <div class="menu-info">
          <div class="menu-title">
            <h4>${item.title}</h4>
            <h4 class="price">${item.price}</h4>
          </div>
          <div class="menu-text">${item.desc}</div>
        </div>
      </div>
    `;
  }).join(''); 


  menuSection.innerHTML = htmls;
}