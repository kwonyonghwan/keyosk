<template>

<v-data-table
    :headers="headers"
    :items="myPage"
    :items-per-page="5"
    class="elevation-1"
  ></v-data-table>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'MyPage',
    props: {
      value: Object,
      editMode: Boolean,
      isNew: Boolean
    },
    data: () => ({
        headers: [
            { text: "orderId", value: "orderId" },
            { text: "orderStatus", value: "orderStatus" },
            { text: "customerId", value: "customerId" },
            { text: "customerName", value: "customerName" },
            { text: "storeId", value: "storeId" },
            { text: "menuId", value: "menuId" },
            { text: "menuCount", value: "menuCount" },
            { text: "storeName", value: "storeName" },
            { text: "totalPrice", value: "totalPrice" },
        ],
        myPage : [],
    }),
    async created() {
      var temp = await axios.get(axios.backend + '/mypages')

      this.myPage = temp.data._embedded.mypages;

    },
    methods: {
    }
  }
</script>

